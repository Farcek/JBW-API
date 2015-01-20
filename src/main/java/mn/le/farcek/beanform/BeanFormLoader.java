/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

import mn.le.farcek.beanform.exception.IgnoreException;

/**
 *
 * @author Farcek
 */
public interface BeanFormLoader {

    Object loadPropery(FormField field) throws IgnoreException ;
}
