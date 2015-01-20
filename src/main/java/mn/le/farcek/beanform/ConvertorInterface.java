/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

import mn.le.farcek.beanform.exception.ConvertorException;
import mn.le.farcek.beanform.exception.IgnoreException;
import mn.le.farcek.http.request.HttpParam;
import mn.le.farcek.jbw.api.action.IActionRequest;

/**
 *
 * @author Farcek
 */
public interface ConvertorInterface {

    String toString(FormField field, Object value);

    Object fromString(FormField field, IActionRequest request) throws ConvertorException, IgnoreException;
}
