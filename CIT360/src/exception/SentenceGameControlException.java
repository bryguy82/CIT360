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
public class SentenceGameControlException extends Exception {

    public SentenceGameControlException() {
        // empty constructor
    }

    public SentenceGameControlException(String message, Throwable cause, boolean enableSuppression, boolean writeableStackTrace) {
        super(message, cause, enableSuppression, writeableStackTrace);
    }

    public SentenceGameControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public SentenceGameControlException(String message) {
        super(message);
    }

    public SentenceGameControlException(Throwable cause) {
        super(cause);
    }
}
