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
public class MissingBundle extends JBWException {

    public MissingBundle() {
    }

    public MissingBundle(String message) {
        super(message);
    }

    public MissingBundle(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingBundle(Throwable cause) {
        super(cause);
    }

    public MissingBundle(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
