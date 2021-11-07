package com.company.exception;

public class RoverOutOfBoundsException extends RuntimeException {

    public RoverOutOfBoundsException(int minX, int minY, int maxX, int maxY) {
        super(String
            .format("Position can not be beyond bounderies (%s , %s) and (%s , %s)",
                minX, minY, maxX, maxY));
    }
}
