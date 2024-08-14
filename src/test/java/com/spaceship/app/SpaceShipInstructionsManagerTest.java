package com.spaceship.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpaceShipInstructionsManagerTest {

    @Test
    void testPerformInstructionListToSpaceShipShortInput() {

        SpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        SpaceShipInstructionsManager.setPointPlateauUpperRight(new SpaceCoordinate(10, 10));

        try {
            SpaceShipInstructionsManager.performInstructionStringToSpaceShip(spaceShip, "MMRLRMMLRM");
        } catch (Exception e) {
            System.out.printf("ERROR: %s%n", e);
        }

        ISpaceCoordinate expectedValue = new SpaceCoordinate(4, 4);
        ISpaceCoordinate actualValue = spaceShip.getCoordinate();

        assertEquals(expectedValue, actualValue);

        char expectedDirectionValue = 'E';
        char actualDirectionValue = spaceShip.getDirection();

        assertEquals(expectedDirectionValue, actualDirectionValue);

    }

    @Test
    void testPerformInstructionListToSpaceShipLongInput() {

        ISpaceShip spaceShip = new SpaceShip(1, 2, 'N');

        SpaceShipInstructionsManager.setPointPlateauUpperRight(new SpaceCoordinate(10, 10));

        try {
            SpaceShipInstructionsManager.performInstructionStringToSpaceShip(spaceShip, "RRRRRLRLRRRRRLRLRRRRRLRLMRRMRRRRRRRLRLRRRRRLRLRRRRRLRLMRRMRRRRRRRLRLRRRRRLRLRRRRRLRLMRRMRR");
        } catch (Exception e) {
            System.out.printf("ERROR: %s%n", e);
        }

        ISpaceCoordinate<Integer> expectedValue = new SpaceCoordinate(1, 2);
        ISpaceCoordinate<Integer> actualValue = spaceShip.getCoordinate();

        assertEquals(expectedValue, actualValue);

        char expectedDirectionValue = 'N';
        char actualDirectionValue = spaceShip.getDirection();

        assertEquals(expectedDirectionValue, actualDirectionValue);

    }

}
