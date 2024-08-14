package com.spaceship.app;

public class DirectingToSouthState implements ISpaceShipDirectionState {

    @Override
    public void turnLeft(SpaceShipDirectionContext context) {

        context.setState(new DirectingToEastState());
    }

    @Override
    public void turnRight(SpaceShipDirectionContext context) {

        context.setState(new DirectingToWestState());
    }

}
