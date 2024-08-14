package com.spaceship.app;

public class SpaceShip implements ISpaceShip {

    SpaceCoordinate coordinate;
    SpaceShipDirectionContext spaceShipDirectionContext;

    public SpaceShip(int coordinateX, int coordinateY, char direction) {

        this.coordinate = new SpaceCoordinate(coordinateX, coordinateY);
        this.spaceShipDirectionContext = new SpaceShipDirectionContext(direction);
    }

    public SpaceCoordinate getCoordinate() {

        return this.coordinate;

    }

    public char getDirection() {

        return this.spaceShipDirectionContext.getStateInChar();

    }

    public void turnLeft() {

        spaceShipDirectionContext.turnLeft();

    }

    public void turnRight() {

        spaceShipDirectionContext.turnRight();
    }

    public void moveForward() {

        this.coordinate = simulateMoveForward(this.coordinate);
    }

    public SpaceCoordinate simulateMoveForward(ISpaceCoordinate currentCoordinate) {

        int diffX = 0, diffY = 0;

        switch (this.spaceShipDirectionContext.getStateInChar()) {
            case 'N':
                diffY = 1;
                break;
            case 'S':
                diffY = -1;
                break;
            case 'E':
                diffX = 1;
                break;
            case 'W':
                diffX = -1;
                break;
        }

        return new SpaceCoordinate((int) currentCoordinate.getX() + diffX, (int) currentCoordinate.getY() + diffY);
    }

    @Override
    public String toString() {

        return String.format("%d %d %c", coordinate.getX(), coordinate.getY(), spaceShipDirectionContext.getStateInChar());

    }
}
