package com.company;

import com.company.exception.RoverOutOfBoundsException;
import lombok.Getter;

@Getter
public class Rover implements Moveable {

    private Coordinate coordinate;
    private Direction direction;
    private Plateau plateau;

    public Rover(Coordinate coordinate, Direction direction, Plateau plateau) {
        this.coordinate = coordinate;
        this.direction = direction;
        this.plateau = plateau;
    }

    public void execute(String commands) {
        commands.toUpperCase().chars().mapToObj(c -> (char) c).forEach(this::process);
    }

    protected void process(Character action) {
        if (com.company.Instruction.MOVE.getShortName().equals(action)) {
            move();
        } else if (com.company.Instruction.LEFT.getShortName().equals(action)) {
            rotateLeft();
        } else if (com.company.Instruction.RIGHT.getShortName().equals(action)) {
            rotateRight();
        }
    }

    @Override
    public void move() {
        switch (direction) {
            case NORTH:
                coordinate.goNorth();
                break;
            case SOUTH:
                coordinate.goSouth();
                break;
            case WEST:
                coordinate.goWest();
                break;
            case EAST:
                coordinate.goEast();
                break;
        }
        if (!plateau.isValidMove(coordinate)) {
            throw new RoverOutOfBoundsException(plateau.getMinPointX(), plateau.getMinPointY(),
                plateau.getMaxPointX(), plateau.getMaxPointX());
        }
    }

    protected void rotateLeft() {
        direction = direction.left();
    }

    protected void rotateRight() {
        direction = direction.right();
    }

    @Override
    public String toString() {
        return coordinate.getX() + " " + coordinate.getY() + " " + direction.getShortName();
    }

}
