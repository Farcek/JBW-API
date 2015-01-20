/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

import mn.le.farcek.common.bean.BeanProperty;

/**
 *
 * @author Farcek
 */
public interface ElementFactoryInterface {
    FormElement factory(FormField field);
}
