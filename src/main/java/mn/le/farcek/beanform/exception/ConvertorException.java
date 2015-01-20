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
public class ConvertorException extends Exception{

    public ConvertorException() {
    }

    public ConvertorException(String message) {
        super(message);
    }

    public ConvertorException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConvertorException(Throwable cause) {
        super(cause);
    }

    public ConvertorException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
