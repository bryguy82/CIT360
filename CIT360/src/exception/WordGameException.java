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
public class WordGameException extends Exception {
    
    public WordGameException() {
        // empty constructor
    }

    public WordGameException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }

    public WordGameException(String message, Throwable cause) {
        super(message, cause);
    }

    public WordGameException(String message) {
        super(message);
    }

    public WordGameException(Throwable cause) {
        super(cause);
    }
}
