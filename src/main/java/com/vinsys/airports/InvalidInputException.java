package com.vinsys.airports;

/**
 * @version 1.0
 * Example of inheritence --> A-->B
 */
public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super();
    }

    public InvalidInputException(String message) {
        super(message);
    }
}

