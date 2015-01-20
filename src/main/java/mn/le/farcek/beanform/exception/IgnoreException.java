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
public class IgnoreException extends Exception{

    public IgnoreException() {
    }

    public IgnoreException(String message) {
        super(message);
    }

    public IgnoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public IgnoreException(Throwable cause) {
        super(cause);
    }

    public IgnoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
