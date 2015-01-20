/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.validation;

import java.util.Set;
import javax.validation.ConstraintViolation;
import mn.le.farcek.common.utils.FStringUtils;

/**
 *
 * @author Farcek
 * @param <T>
 */
public class ValidatorResult<T> {

    private final Set<ConstraintViolation<T>> messages;

    public ValidatorResult(Set<ConstraintViolation<T>> messages) {
        this.messages = messages;
    }

    public boolean isValid() {
        return messages.isEmpty();
    }

    public Set<ConstraintViolation<T>> getMessages() {
        return messages;
    }
    
    public String getFullMessage(){
        StringBuilder sb = new StringBuilder();
        
        for (ConstraintViolation<T> it : messages) {
            String p=it.getPropertyPath().toString();
            if(FStringUtils.notEmpty(p)){
                sb.append(p).append(": ");
            }
            sb.append(it.getMessage()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "ValidatorResult{" + "messages=" + messages + '}';
    }

}
