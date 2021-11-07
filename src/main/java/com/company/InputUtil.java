package com.company;

import com.company.exception.InvalidCoordinateInputException;
import com.company.exception.InvalidDirectionInputException;
import com.company.exception.InvalidPlateauInputException;
import com.company.exception.InvalidRoverInformationInputException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

public class InputUtil {

    private InputUtil() {
    }

    public static Plateau parsePlateau(String plateauInput) {
        validatePlateauInput(plateauInput);

        String[] coordinates = plateauInput.split(" ");
        return new Plateau(0, Integer.parseInt(coordinates[0]),
            0, Integer.parseInt(coordinates[1]));
    }

    private static void validatePlateauInput(String plateauInput) {
        if (StringUtils.isEmpty(plateauInput)) {
            throw new InvalidPlateauInputException(plateauInput);
        }

        String[] coordinates = plateauInput.split(" ");
        if (coordinates.length != 2) {
            throw new InvalidPlateauInputException(plateauInput);
        }

        String xCoor = coordinates[0];
        String yCoor = coordinates[1];

        if (!NumberUtils.isCreatable(xCoor) || !NumberUtils.isCreatable(yCoor)) {
            throw new InvalidPlateauInputException(plateauInput);
        }

        if (Integer.parseInt(xCoor) < 0 || Integer.parseInt(yCoor) < 0) {
            throw new InvalidPlateauInputException(plateauInput);
        }
    }

    public static Coordinate parseRoverCoordinates(String roverInformation) {
        validateRoverCoordinateInput(roverInformation);

        String[] roverInformationArray = roverInformation.split(" ");
        int xCoordinate = Integer.parseInt(roverInformationArray[0]);
        int yCoordinate = Integer.parseInt(roverInformationArray[1]);
        return new Coordinate(xCoordinate, yCoordinate);
    }

    private static void validateRoverCoordinateInput(String roverInformation) {
        checkRoverInformationIsEmptyOrUnexpectedAttribute(roverInformation);

        String[] roverInformationArray = roverInformation.split(" ");
        String coordX = roverInformationArray[0];
        String coordY = roverInformationArray[1];

        if (!NumberUtils.isCreatable(coordX) || !NumberUtils.isCreatable(coordY)) {
            throw new InvalidCoordinateInputException(coordX + ", " + coordY);
        }

        if (Integer.parseInt(coordX) < 0 || Integer.parseInt(coordY) < 0) {
            throw new InvalidCoordinateInputException(coordX + ", " + coordY);
        }
    }

    public static Direction parseRoverDirection(String roverInformation) {
        validateRoverDirectionInput(roverInformation);
        String[] roverInformationArray = roverInformation.split(" ");
        return Direction.from(roverInformationArray[2].toUpperCase());
    }

    private static void validateRoverDirectionInput(String roverInformation) {
        checkRoverInformationIsEmptyOrUnexpectedAttribute(roverInformation);

        String[] roverInfoArray = roverInformation.split(" ");
        String directionShortName = roverInfoArray[2];
        Direction from = Direction.from(directionShortName.toUpperCase());
        if (from == null) {
            throw new InvalidDirectionInputException(directionShortName);
        }
    }

    private static void checkRoverInformationIsEmptyOrUnexpectedAttribute(String roverInformation) {
        if (StringUtils.isEmpty(roverInformation)) {
            throw new InvalidRoverInformationInputException();
        }

        String[] roverInfoArray = roverInformation.split(" ");
        if (roverInfoArray.length != 3) {
            throw new InvalidRoverInformationInputException();
        }
    }
}
