/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Bryan
 */
public class SentenceException extends Exception {
    
    public SentenceException() {
        // empty constructor
    }

    public SentenceException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }

    public SentenceException(String message, Throwable cause) {
        super(message, cause);
    }

    public SentenceException(String message) {
        super(message);
    }

    public SentenceException(Throwable cause) {
        super(cause);
    }
}
