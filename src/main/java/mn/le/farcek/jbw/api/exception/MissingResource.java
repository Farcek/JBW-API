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
public class MissingResource extends JBWException {

    public MissingResource() {
    }

    public MissingResource(String message) {
        super(message);
    }

    public MissingResource(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingResource(Throwable cause) {
        super(cause);
    }

    public MissingResource(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
