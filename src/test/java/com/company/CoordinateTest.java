package com.company;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class CoordinateTest extends BaseTest {

    @Test
    public void whenCoordinateIsConstructedCoordinatsAreEqual() throws Exception {
        coordinate = new Coordinate(1, 2);

        assertEquals(1, coordinate.getX());
        assertEquals(2, coordinate.getY());
    }

    @Test
    public void whenGoNorthCoordinatesAreOk() throws Exception {
        coordinate = new Coordinate(1, 2);
        coordinate.goNorth();
        assertEquals(3, coordinate.getY());
    }

    @Test
    public void whenGoSouthCoordinatesAreOk() throws Exception {
        coordinate = new Coordinate(1, 2);
        coordinate.goSouth();
        assertEquals(1, coordinate.getY());
    }

    @Test
    public void whenGoEastCoordinatesAreOk() throws Exception {
        coordinate = new Coordinate(1, 2);
        coordinate.goEast();
        assertEquals(2, coordinate.getX());
    }

    @Test
    public void whenGoWestCoordinatesAreOk() throws Exception {
        coordinate = new Coordinate(1, 2);
        coordinate.goWest();
        assertEquals(0, coordinate.getX());
    }
}
