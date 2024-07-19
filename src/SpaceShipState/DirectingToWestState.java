package SpaceShipState;

public class DirectingToWestState implements ISpaceShipDirectionState {

    @Override
    public void turnLeft(SpaceShipDirectionContext context) {

        context.setState(new DirectingToSouthState());
    }

    @Override
    public void turnRight(SpaceShipDirectionContext context) {

        context.setState(new DirectingToNorthState());
    }

}
