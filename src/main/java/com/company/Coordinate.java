package com.company;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void goNorth() {
        this.y++;
    }

    public void goSouth() {
        this.y--;
    }

    public void goEast() {
        this.x++;
    }

    public void goWest() {
        this.x--;
    }
}
