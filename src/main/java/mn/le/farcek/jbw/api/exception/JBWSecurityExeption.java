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
public class JBWSecurityExeption extends JBWRuntimeException {

    public JBWSecurityExeption() {
    }

    public JBWSecurityExeption(String message) {
        super(message);
    }

    public JBWSecurityExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public JBWSecurityExeption(Throwable cause) {
        super(cause);
    }

    public JBWSecurityExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
