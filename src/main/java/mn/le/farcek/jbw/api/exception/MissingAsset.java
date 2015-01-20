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
public class MissingAsset extends JBWRuntimeException{

    public MissingAsset() {
    }

    public MissingAsset(String message) {
        super(message);
    }

    public MissingAsset(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingAsset(Throwable cause) {
        super(cause);
    }

    public MissingAsset(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
