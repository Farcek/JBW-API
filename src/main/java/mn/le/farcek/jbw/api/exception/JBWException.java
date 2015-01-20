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
public class JBWException extends Exception {

    public JBWException() {
    }

    public JBWException(String message) {
        super(message);
    }

    public JBWException(String message, Throwable cause) {
        super(message, cause);
    }

    public JBWException(Throwable cause) {
        super(cause);
    }

    public JBWException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    

}
