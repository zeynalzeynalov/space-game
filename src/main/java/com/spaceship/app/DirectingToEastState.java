package com.spaceship.app;

public class DirectingToEastState implements ISpaceShipDirectionState {

    @Override
    public void turnLeft(SpaceShipDirectionContext context) {

        context.setState(new DirectingToNorthState());
    }

    @Override
    public void turnRight(SpaceShipDirectionContext context) {

        context.setState(new DirectingToSouthState());
    }

}
