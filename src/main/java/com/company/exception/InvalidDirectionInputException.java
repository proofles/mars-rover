package com.company.exception;

public class InvalidDirectionInputException extends RuntimeException {

    public InvalidDirectionInputException(String input) {
        super("Invalid direction input: " + input);
    }
}
