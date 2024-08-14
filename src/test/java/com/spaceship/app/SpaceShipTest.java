package com.spaceship.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpaceShipTest {

    @Test
    void testGetCoordinate() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        ISpaceCoordinate<Integer> expectedValue = new SpaceCoordinate(1, 2);
        ISpaceCoordinate<Integer> actualValue = spaceShip.getCoordinate();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    void testGetDirection() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        char expectedValue = 'N';
        char actualValue = spaceShip.getDirection();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    void testTurnLeft() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        spaceShip.turnLeft();

        char expectedValue = 'W';
        char actualValue = spaceShip.getDirection();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    void testTurnRight() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        spaceShip.turnRight();

        char expectedValue = 'E';
        char actualValue = spaceShip.getDirection();

        assertEquals(expectedValue, actualValue);

    }

    @Test
    void testMoveForward() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        spaceShip.moveForward();

        ISpaceCoordinate<Integer> expectedValue = new SpaceCoordinate(1, 3);
        ISpaceCoordinate<Integer> actualValue = spaceShip.getCoordinate();

        assertEquals(expectedValue, actualValue);

    }

}
