package com.company.exception;

public class InvalidRoverInformationInputException extends RuntimeException {

    public InvalidRoverInformationInputException() {
        super("Invalid rover information format");
    }
}
