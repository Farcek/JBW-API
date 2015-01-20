/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.validation.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import mn.le.farcek.validation.Email;


/**
 *
 * @author Farcek
 */
public class EmailValidator implements ConstraintValidator<Email, Object> {

    final String ePattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    private Pattern pattern;

    @Override
    public void initialize(Email constraintAnnotation) {
        pattern = Pattern.compile(ePattern);
    }

    @Override
    public boolean isValid(Object value, ConstraintValidatorContext context) {

        if (value == null) {
            return false;
        }
        String email = value.toString();

        Matcher matcher = pattern.matcher(email);

        return matcher.matches();

    }

}
