package com.company;

import com.company.exception.InvalidCoordinateInputException;
import com.company.exception.InvalidDirectionInputException;
import com.company.exception.InvalidPlateauInputException;
import com.company.exception.InvalidRoverInformationInputException;
import com.company.exception.RoverOutOfBoundsException;
import org.junit.Test;

public class ExceptionTest extends BaseTest {


    @Test(expected = RoverOutOfBoundsException.class)
    public void whenRoverMovesOutOfNorthBoundsExceptionIsThrown() {
        coordinate = new Coordinate(plateau.getMaxPointX(), plateau.getMaxPointY());
        direction = Direction.NORTH;
        Rover rover = new Rover(coordinate, direction, plateau);
        rover.move();
    }

    @Test(expected = InvalidCoordinateInputException.class)
    public void whenParseCoordinateInputInvalidCoordinateInputExceptionIsThrown() {
        String coordinateInput = "1 A N";
        InputUtil.parseRoverCoordinates(coordinateInput);
    }

    @Test(expected = InvalidCoordinateInputException.class)
    public void whenParseCoordinateWithNegativeInputInvalidCoordinateInputExceptionIsThrown() {
        String coordinateInput = "1 -1 N";
        InputUtil.parseRoverCoordinates(coordinateInput);
    }

    @Test(expected = InvalidPlateauInputException.class)
    public void whenParsePlateauWithNonDigitInputInvalidPlateauInputExceptionIsThrown() {
        String plateauInput = "1 B";
        InputUtil.parsePlateau(plateauInput);
    }

    @Test(expected = InvalidPlateauInputException.class)
    public void whenParsePlateauInputWithEmptyStringInvalidPlateauInputExceptionIsThrown() {
        String plateauInput = "";
        InputUtil.parsePlateau(plateauInput);
    }

    @Test(expected = InvalidPlateauInputException.class)
    public void whenParsePlateauWithInvalidArgCountInputInvalidPlateauInputExceptionIsThrown() {
        String plateauInput = "1 2 3";
        InputUtil.parsePlateau(plateauInput);
    }

    @Test(expected = InvalidPlateauInputException.class)
    public void whenParsePlateauWithNegativeInputInvalidPlateauInputExceptionIsThrown() {
        String plateauInput = "1 -1";
        InputUtil.parsePlateau(plateauInput);
    }

    @Test(expected = InvalidDirectionInputException.class)
    public void whenParseDirectionInputInvalidDirectionInputExceptionIsThrown() {
        String directionInput = "1 2 Z";
        InputUtil.parseRoverDirection(directionInput);
    }

    @Test(expected = InvalidRoverInformationInputException.class)
    public void whenParseDirectionEmptyInputInvalidRoverInformationInputExceptionIsThrown() {
        String directionInput = "";
        InputUtil.parseRoverDirection(directionInput);
    }

    @Test(expected = InvalidRoverInformationInputException.class)
    public void whenParseDirectionWrongArgsCountInputInvalidRoverInformationInputExceptionIsThrown() {
        String directionInput = "1 2 N 4";
        InputUtil.parseRoverDirection(directionInput);
    }

}
