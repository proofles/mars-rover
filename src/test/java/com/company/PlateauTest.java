package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlateauTest extends BaseTest {

    @Test
    public void whenPlateauIsConstructedLowerLeftCoordinatesAreZeroZero() throws Exception {
        assertEquals(0, plateau.getMinPointX());
        assertEquals(0, plateau.getMinPointY());
    }

    @Test
    public void whenPlateauIsConstructedUpperRightCoordinatesAreTrue() throws Exception {
        assertEquals(5, plateau.getMaxPointX());
        assertEquals(5, plateau.getMaxPointY());
    }

    @Test
    public void whenPlateauAndCoordinatAreCounstuctedValidMove() {
        coordinate = new Coordinate(xCoordinate, yCoordinate);
        assertEquals(true, plateau.isValidMove(coordinate));
    }
}
