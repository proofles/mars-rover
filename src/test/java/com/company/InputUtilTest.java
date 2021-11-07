package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class InputUtilTest extends BaseTest {

    @Test
    public void whenPlateauInputIsParsedPlateauIsConstructed() throws Exception {
        String plateauInput = "5 5";
        Plateau plateauOutput = InputUtil.parsePlateau(plateauInput);

        assertEquals(0, plateauOutput.getMinPointX());
        assertEquals(0, plateauOutput.getMinPointY());
        assertEquals(5, plateauOutput.getMaxPointX());
        assertEquals(5, plateauOutput.getMaxPointY());
    }

    @Test
    public void whenRoverInformationInputIsParsedCoordinatIsConstructed() throws Exception {
        String positionInput = "1 2 N";
        Coordinate coordinate = InputUtil.parseRoverCoordinates(positionInput);

        assertEquals(1, coordinate.getX());
        assertEquals(2, coordinate.getY());
    }

    @Test
    public void whenRoverInformationInputIsParsedDirectionIsConstructed() throws Exception {
        String positionInput = "1 2 N";
        Direction direction = InputUtil.parseRoverDirection(positionInput);

        assertEquals(Direction.NORTH, direction);
    }
}
