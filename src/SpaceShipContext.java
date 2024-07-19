import SpaceShipState.ISpaceShipDirectionState;

public class SpaceShipContext {

    private ISpaceShipDirectionState state;

    public void setState(ISpaceShipDirectionState state) {

        this.state = state;
    }

    public ISpaceShipDirectionState getState() {

        return state;
    }

}
