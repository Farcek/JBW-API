/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.le.farcek.jbw.api.exception;

/**
 *
 * @author Farcek
 */
public class JBWRuntimeException extends RuntimeException {

    public JBWRuntimeException() {
    }

    public JBWRuntimeException(String message) {
        super(message);
    }

    public JBWRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public JBWRuntimeException(Throwable cause) {
        super(cause);
    }

    public JBWRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

}