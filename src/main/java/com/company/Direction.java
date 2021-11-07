package com.company;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Direction {
    NORTH("N") {
        @Override
        public Direction left() {
            return WEST;
        }

        @Override
        public Direction right() {
            return EAST;
        }
    },
    SOUTH("S") {
        @Override
        public Direction left() {
            return EAST;
        }

        @Override
        public Direction right() {
            return WEST;
        }
    },
    WEST("W") {
        @Override
        public Direction left() {
            return SOUTH;
        }

        @Override
        public Direction right() {
            return NORTH;
        }
    },
    EAST("E") {
        @Override
        public Direction left() {
            return NORTH;
        }

        @Override
        public Direction right() {
            return SOUTH;
        }
    };

    private String shortName;

    Direction(String shortName) {
        this.shortName = shortName;
    }

    static final Map<String, Direction> directions = Arrays.stream(Direction.values())
        .collect(Collectors.toMap(Direction::getShortName, Function.identity()));

    protected abstract Direction left();

    protected abstract Direction right();

    public String getShortName() {
        return shortName;
    }

    public static Direction from(final String shortName) {
        return directions.get(shortName);
    }
}