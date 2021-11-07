package com.company.exception;

public class InvalidCoordinateInputException extends RuntimeException {

    public InvalidCoordinateInputException(String input) {
        super("Invalid coordinate input: " + input);
    }
}
