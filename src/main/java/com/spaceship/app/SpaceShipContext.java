package com.spaceship.app;

public class SpaceShipContext {

    private ISpaceShipDirectionState state;

    public ISpaceShipDirectionState getState() {

        return state;
    }

    public void setState(ISpaceShipDirectionState state) {

        this.state = state;
    }

}
