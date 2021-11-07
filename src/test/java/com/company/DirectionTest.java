package com.company;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class DirectionTest extends BaseTest {

    @Test
    public void whenDirectionIsConstructedShortNamesAreEqual() {
        direction = Direction.NORTH;
        assertEquals(Direction.NORTH.getShortName(), direction.getShortName());
    }

    @Test
    public void whenNorthDirectionTurnsLeftNewDirectionIsWest() throws Exception {
        direction = Direction.NORTH;
        direction = direction.left();
        assertEquals(Direction.WEST, direction);
    }

    @Test
    public void whenNorthDirectionTurnsRightNewDirectionIsEast() throws Exception {
        direction = Direction.NORTH;
        direction = direction.right();
        assertEquals(Direction.EAST, direction);
    }

    @Test
    public void whenSouthDirectionTurnsLeftNewDirectionIsEast() throws Exception {
        direction = Direction.SOUTH;
        direction = direction.left();
        assertEquals(Direction.EAST, direction);
    }

    @Test
    public void whenSouthDirectionTurnsRightNewDirectionIsWest() throws Exception {
        direction = Direction.SOUTH;
        direction = direction.right();
        assertEquals(Direction.WEST, direction);
    }

    @Test
    public void whenWestDirectionTurnsLeftNewDirectionIsSouth() throws Exception {
        direction = Direction.WEST;
        direction = direction.left();
        assertEquals(Direction.SOUTH, direction);
    }

    @Test
    public void whenWestDirectionTurnsRightNewDirectionIsNorth() throws Exception {
        direction = Direction.WEST;
        direction = direction.right();
        assertEquals(Direction.NORTH, direction);
    }

    @Test
    public void whenEastDirectionTurnsLeftNewDirectionIsNorth() throws Exception {
        direction = Direction.EAST;
        direction = direction.left();
        assertEquals(Direction.NORTH, direction);
    }

    @Test
    public void whenEastDirectionTurnsRightNewDirectionIsSouth() throws Exception {
        direction = Direction.EAST;
        direction = direction.right();
        assertEquals(Direction.SOUTH, direction);
    }


    @Test
    public void whenDirectionFromValueIsTrue() {
        direction = Direction.from("N");
        assertEquals(Direction.NORTH, direction);
    }
}
