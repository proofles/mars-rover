package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Rover> rovers = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            Plateau plateau = getPlateau(scanner);

            String roverInformation;
            //Instructions are used to create a Rover object and Command object
            //The do while loop is used to make the rover input flexible. rover can be added until there is a blank line entry.
            do {
                roverInformation = getRoverInformation(scanner);
                //Blank line entered to finish rover entry.
                if (!"".equals(roverInformation)) {
                    Coordinate coordinates = getCoordinate(roverInformation);
                    Direction direction = getDirection(roverInformation);

                    Rover rover = new Rover(coordinates, direction, plateau);

                    String roverCommands = getCommands(scanner);

                    rover.execute(roverCommands);

                    rovers.add(rover);
                }
            } while (!"".equals(roverInformation));

            rovers.forEach(System.out::println);
        }
    }

    private static String getRoverInformation(Scanner scanner) {
        String roverInformation;
        System.out.println("Enter the rover information (Press enter to finish rover entry)");
        roverInformation = scanner.nextLine();
        return roverInformation;
    }

    private static String getCommands(Scanner scanner) {
        System.out.println("Enter rover commands");
        return scanner.nextLine();
    }

    private static Direction getDirection(String roverInformation) {
        return InputUtil.parseRoverDirection(roverInformation);
    }

    private static Coordinate getCoordinate(String roverInformation) {
        return InputUtil.parseRoverCoordinates(roverInformation);
    }

    private static Plateau getPlateau(Scanner scanner) {
        System.out.println("Enter the upper-right coordinates of the plateau:");
        String plateauInstruction = scanner.nextLine();
        return InputUtil.parsePlateau(plateauInstruction);
    }
}
