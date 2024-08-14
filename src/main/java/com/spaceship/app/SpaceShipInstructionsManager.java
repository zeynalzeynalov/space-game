package com.spaceship.app;

public abstract class SpaceShipInstructionsManager {

    private static ISpaceCoordinate<Integer> pointPlateauUpperRight;

    public static void setPointPlateauUpperRight(ISpaceCoordinate PlateauUpperRight) {

        pointPlateauUpperRight = PlateauUpperRight;

    }

    public static void performInstructionStringToSpaceShip(ISpaceShip spaceShip, String instructionString) throws InvalidUpperRightBorderCoordinateException {

        if (pointPlateauUpperRight == null)
            throw new InvalidUpperRightBorderCoordinateException("Please set a coordinate for upper right point of plateau!");

        for (int i = 0; i < instructionString.length(); i++) {

            switch (instructionString.charAt(i)) {

                case 'M':
                    if (isNewMovingCoordinateInsidePlateau(spaceShip, pointPlateauUpperRight))
                        spaceShip.moveForward();
                    break;
                case 'L':
                    spaceShip.turnLeft();
                    break;
                case 'R':
                    spaceShip.turnRight();
                    break;
            }

        }

    }

    private static boolean isNewMovingCoordinateInsidePlateau(ISpaceShip spaceShip, ISpaceCoordinate<Integer> pointPlateauUpperRight) {

        ISpaceCoordinate<Integer> newCoordinate = spaceShip.simulateMoveForward(spaceShip.getCoordinate());

        return (newCoordinate.getX() >= 0 && newCoordinate.getX() <= pointPlateauUpperRight.getX() &&
                newCoordinate.getY() >= 0 && newCoordinate.getY() <= pointPlateauUpperRight.getY());

    }

}
