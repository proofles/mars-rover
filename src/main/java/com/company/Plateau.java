package com.company;

import lombok.Getter;

@Getter
public class Plateau {

    private int minPointX;
    private int maxPointX;
    private int minPointY;
    private int maxPointY;

    public Plateau(int minPointX, int maxPointX, int minPointY, int maxPointY) {
        this.minPointX = minPointX;
        this.maxPointX = maxPointX;
        this.minPointY = minPointY;
        this.maxPointY = maxPointY;
    }

    public boolean isValidMove(Coordinate coordinate) {
        return coordinate.getX() >= minPointX &&
            coordinate.getX() <= maxPointX &&
            coordinate.getY() >= minPointY &&
            coordinate.getY() <= maxPointY;
    }
}
