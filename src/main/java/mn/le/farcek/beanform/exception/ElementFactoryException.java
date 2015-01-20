/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.beanform.exception;

/**
 *
 * @author Farcek
 */
public class ElementFactoryException extends Exception{

    public ElementFactoryException() {
    }

    public ElementFactoryException(String message) {
        super(message);
    }

    public ElementFactoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public ElementFactoryException(Throwable cause) {
        super(cause);
    }

    public ElementFactoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
