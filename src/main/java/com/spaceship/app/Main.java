package com.spaceship.app;

/**
 * @author Zeynal Zeynalov
 * @version 1.0
 * @since 2018
 * <p>
 * Warning: 	If spaceship tries to pass borders of Plateau, SpaceShipInstructionsManager will ignore this movement and continue
 * performing next instructions.
 */

public class Main {
    public static void main(String[] args) {
        String filePath = args.length > 0 ? args[0] : "sampleInputDefault.txt";

        InstructionsInputManager instructionsInputManager = new InstructionsInputManager();
        instructionsInputManager.readFromFile(filePath);

        SpaceShipInstructionsManager.setPointPlateauUpperRight(instructionsInputManager.getPointPlateauUpperRight());

        for (InstructionsInputManager.SpaceShipInstruction spaceShipInstruction : instructionsInputManager.getSpaceShipInstructionsList()) {

            try {
                SpaceShipInstructionsManager.performInstructionStringToSpaceShip(spaceShipInstruction.getSpaceShip(), spaceShipInstruction.getInstructionString());
            } catch (Exception e) {
                System.out.printf("ERROR: %s%n", e);
            }

            System.out.println(spaceShipInstruction.getSpaceShip().toString());
        }
    }
}
