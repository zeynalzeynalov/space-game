public interface ISpaceShip {

    String directionList = "NESW";

    ISpaceCoordinate getCoordinate();

    char getDirection();

    void turnLeft();

    void turnRight();

    void moveForward();

    ISpaceCoordinate simulateMoveForward(ISpaceCoordinate currentCoordinate);

    String toString();

}
