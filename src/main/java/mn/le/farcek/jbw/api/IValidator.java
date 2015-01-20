/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api;

import mn.le.farcek.jbw.api.validation.ValidatorResult;

/**
 *
 * @author Farcek
 */
public interface IValidator {
    public <T> ValidatorResult<T> validate(T bean, Class<?>... groups);
}
