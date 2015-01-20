/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

import java.util.List;
import mn.le.farcek.beanform.exception.ConvertorException;
import mn.le.farcek.common.bean.BeanProperty;

/**
 *
 * @author Farcek
 */
public interface FormField {

    BeanForm<?> getBeanForm();

    BeanProperty getBeanProperty();
    
    boolean isReadonly();

    ConvertorInterface getConvertor() throws ConvertorException;
    
    List<String> getErrors();
    void addError(String error);
}
