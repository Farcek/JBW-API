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
public class MissingController extends JBWException {

    public MissingController() {
    }

    public MissingController(String message) {
        super(message);
    }

    public MissingController(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingController(Throwable cause) {
        super(cause);
    }

    public MissingController(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
