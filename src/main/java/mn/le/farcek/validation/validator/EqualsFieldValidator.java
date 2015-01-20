/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.validation.validator;

import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mn.le.farcek.common.bean.BeanProperty;
import mn.le.farcek.common.bean.BeanPropertyFactory;
import mn.le.farcek.common.bean.NoSuchPropertyException;
import mn.le.farcek.validation.EqualsField;

/**
 *
 * @author Farcek
 */
public class EqualsFieldValidator implements ConstraintValidator<EqualsField, Object> {

    public EqualsFieldValidator() {
        System.out.println("create EqualsFieldValidator");
    }

    @Inject
    ServletContext servletContext;

    String field1;
    String field2;

    @Override
    public void initialize(EqualsField constraintAnnotation) {
        field1 = constraintAnnotation.field1();
        field2 = constraintAnnotation.field2();
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        try {
            System.out.println("servletContextservletContextservletContextservletContext=" + servletContext);
            
            BeanProperty property1 = BeanPropertyFactory.factoryProperty(value.getClass(), field1);
            BeanProperty property2 = BeanPropertyFactory.factoryProperty(value.getClass(), field2);
            
            Object v1 = property1.getValue(value);
            Object v2 = property2.getValue(value);
            
            return Objects.equals(v1, v2);
            
            
        } catch (NoSuchPropertyException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
