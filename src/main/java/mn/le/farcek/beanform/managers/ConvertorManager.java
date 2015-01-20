/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform.managers;

import mn.le.farcek.beanform.ConvertorInterface;
import mn.le.farcek.beanform.FormField;
import mn.le.farcek.beanform.exception.ConvertorException;

/**
 *
 * @author Farcek
 */
public interface ConvertorManager {
    ConvertorInterface factory(FormField field) throws ConvertorException;
}
