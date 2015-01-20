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
public class CannotExecutAction extends JBWException {

    public CannotExecutAction() {
    }

    public CannotExecutAction(String message) {
        super(message);
    }

    public CannotExecutAction(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotExecutAction(Throwable cause) {
        super(cause);
    }

    public CannotExecutAction(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
