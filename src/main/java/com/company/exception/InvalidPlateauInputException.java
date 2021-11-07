package com.company.exception;

public class InvalidPlateauInputException extends RuntimeException {

    public InvalidPlateauInputException(String input) {
        super("Invalid pleateua format: " + input);
    }
}
