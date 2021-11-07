package com.company;

import static junit.framework.TestCase.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoverTest extends BaseTest {

    @Before
    public void setUp(){
        direction = Direction.NORTH;
        coordinate = new Coordinate(xCoordinate, yCoordinate);

        rover = new Rover(coordinate, direction, plateau);
    }

    @Test
    public void whenRoverIsConstructedCoordinatesAreOk() throws Exception {
        assertEquals(0, rover.getPlateau().getMinPointX());
        assertEquals(xCoordinate, rover.getCoordinate().getX());
        assertEquals(0, rover.getPlateau().getMinPointY());
        assertEquals(yCoordinate, rover.getCoordinate().getY());
    }

    @Test
    public void whenRoverIsConstructedDirectionIsOk() throws Exception {
        assertEquals(Direction.NORTH, rover.getDirection());
    }

    @Test
    public void whenRequestedRoverCanMove() throws Exception {
        rover.move();
        assertEquals(++yCoordinate, rover.getCoordinate().getY());
    }

    @Test
    public void whenRequestedRoverCanTurnLeft() throws Exception {
        rover.rotateLeft();
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void whenRequestedRoverCanTurnRight() throws Exception {
        rover.rotateRight();
        assertEquals(Direction.EAST, rover.getDirection());
    }

    @Test
    public void whenRequestedRoverCanExecuteTurnLeftCommand() throws Exception {
        String command = "LMLMLMLMMRM";
        rover.execute(command);
        assertEquals(Direction.EAST, rover.getDirection());
        assertEquals(2, rover.getCoordinate().getX());
        assertEquals(3, rover.getCoordinate().getY());
    }

    @Test
    public void whenRequestedRoverCanProcessTurnLeftCommand() throws Exception {
        Character command = Instruction.LEFT.getShortName();
        rover.process(command);
        assertEquals(Direction.WEST, rover.getDirection());
    }

    @Test
    public void testToString() throws Exception {
        String expected = rover.getCoordinate().getX() + " " +
            rover.getCoordinate().getY() + " " +
            rover.getDirection().getShortName();
        assertEquals(expected, rover.toString());
    }
}
