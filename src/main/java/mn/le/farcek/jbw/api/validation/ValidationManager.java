/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.validation;

import java.util.Set;
import javax.validation.ConstraintViolation;

/**
 *
 * @author Farcek
 */
public interface ValidationManager {
    public <T> Set<ConstraintViolation<T>> validate(T bean, Class<?>... groups);
    public boolean valid(Object bean, Class<?>... groups);
}
