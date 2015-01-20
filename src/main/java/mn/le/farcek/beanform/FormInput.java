/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform;

/**
 *
 * @author Farcek
 */
public interface FormInput extends FormField, FormElement {

    public String getId();

    public String getName();

    public String getPlaceholder();

    public String getLabel();
    
    public Object getRawValue();
    public String getValue();

    
}
