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
public class MissingAction extends JBWException {

    public MissingAction() {
    }

    public MissingAction(String message) {
        super(message);
    }

    public MissingAction(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingAction(Throwable cause) {
        super(cause);
    }

    public MissingAction(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
