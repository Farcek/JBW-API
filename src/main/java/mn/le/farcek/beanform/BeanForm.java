/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

import java.util.List;
import mn.le.farcek.beanform.exception.BeanFormExeption;
import mn.le.farcek.beanform.managers.ConvertorManager;
import mn.le.farcek.beanform.managers.ElementFactoryManager;


/**
 *
 * @author Farcek
 * @param <T>
 */
public interface BeanForm<T> {
    Class<T> getBeanClass();
    T getBean();
    void setBean(T bean);
    
    List<FormField> getFields() throws BeanFormExeption;
    List<FormElement> getElements() throws BeanFormExeption;
    
    ConvertorManager getConvertorManager();
    ElementFactoryManager getElementFactoryManager();
    
    T load(BeanFormLoader loader) ;
    
    String getName();

    public boolean valid(Class... groups);
    List<String> getErrors();
    void addError(String error);
    public void setAction(String action);
}
