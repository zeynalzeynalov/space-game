package com.spaceship.app;

public class SpaceShipDirectionContext {

    private ISpaceShipDirectionState state;

    public SpaceShipDirectionContext(char directionInChar) {

        if (directionInChar == 'N')
            this.state = new DirectingToNorthState();
        else if (directionInChar == 'E')
            this.state = new DirectingToEastState();
        else if (directionInChar == 'S')
            this.state = new DirectingToSouthState();
        else if (directionInChar == 'W')
            this.state = new DirectingToWestState();
    }

    public void setState(ISpaceShipDirectionState state) {

        this.state = state;
    }

    public ISpaceShipDirectionState getState() {

        return state;
    }

    public char getStateInChar() {

        return state.getClass().getName().replaceAll("SpaceShipState.DirectingTo", "").charAt(0);
    }

    public String getStateInString() {

        return state.getClass().getName();
    }

    public void turnLeft() {

        state.turnLeft(this);
    }

    public void turnRight() {

        state.turnRight(this);
    }

}
