/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import mn.le.farcek.validation.validator.EqualsFieldValidator;

/**
 *
 * @author Farcek
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = EqualsFieldValidator.class)
public @interface EqualsField {

    String field1();
    String field2();

    String message() default "invalid fields";

    Class[] groups() default {};

    Class[] payload() default {};
}
