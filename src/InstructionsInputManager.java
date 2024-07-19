import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InstructionsInputManager {

    private SpaceCoordinate pointPlateauUpperRight;

    private final List<SpaceShipInstruction> spaceShipInstructionsList;

    public InstructionsInputManager() {

        this.spaceShipInstructionsList = new ArrayList<SpaceShipInstruction>();
    }

    public void readFromFile(String filePath) {
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(file)) {
            String[] plateauUpperRight = scanner.nextLine().split(" ");
            this.pointPlateauUpperRight = new SpaceCoordinate(Integer.parseInt(plateauUpperRight[0]), Integer.parseInt(plateauUpperRight[1]));

            String[] coordinateOfSpaceShip;

            while (scanner.hasNext()) {

                coordinateOfSpaceShip = scanner.nextLine().split(" ");

                spaceShipInstructionsList.add(new SpaceShipInstruction(new SpaceShip(
                        Integer.parseInt(coordinateOfSpaceShip[0]),
                        Integer.parseInt(coordinateOfSpaceShip[1]), coordinateOfSpaceShip[2].charAt(0)),
                        scanner.nextLine()));
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.printf("ERROR: File %s not found!%n", filePath);
        }
    }

    public SpaceCoordinate getPointPlateauUpperRight() {

        return pointPlateauUpperRight;
    }


    public List<SpaceShipInstruction> getSpaceShipInstructionsList() {

        return spaceShipInstructionsList;
    }

    public class SpaceShipInstruction {

        ISpaceShip spaceShip;
        String instructionString;

        public SpaceShipInstruction(ISpaceShip spaceShip, String instructionString) {

            this.spaceShip = spaceShip;
            this.instructionString = instructionString;
        }

        public ISpaceShip getSpaceShip() {
            return spaceShip;
        }

        public void setSpaceShip(ISpaceShip spaceShip) {
            this.spaceShip = spaceShip;
        }

        public String getInstructionString() {
            return instructionString;
        }

        public void setInstructionString(String instructionString) {
            this.instructionString = instructionString;
        }
    }

}
