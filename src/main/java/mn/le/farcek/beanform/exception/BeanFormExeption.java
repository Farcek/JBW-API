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
public class BeanFormExeption extends RuntimeException{

    public BeanFormExeption() {
    }

    public BeanFormExeption(String message) {
        super(message);
    }

    public BeanFormExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public BeanFormExeption(Throwable cause) {
        super(cause);
    }

    public BeanFormExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
