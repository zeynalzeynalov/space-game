package SpaceShipState;

public class DirectingToNorthState implements ISpaceShipDirectionState {


    @Override
    public void turnLeft(SpaceShipDirectionContext context) {

        context.setState(new DirectingToWestState());
    }

    @Override
    public void turnRight(SpaceShipDirectionContext context) {

        context.setState(new DirectingToEastState());
    }

}
