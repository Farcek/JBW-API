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
import mn.le.farcek.validation.validator.NotEmptyValidator;

/**
 *
 * @author Farcek
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Constraint(validatedBy = NotEmptyValidator.class)
public @interface NotEmpty {
    String message() default "value is empty";

    Class[] groups() default {};

    Class[] payload() default {};
}
