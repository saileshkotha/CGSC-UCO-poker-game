package edu.uco.cs.cowtippingdwarfs.card24.userinterface;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;

/**
 * Created by saile on 11/30/2016.
 */
public class GuiCore {
    public static void main(String[] args){
        ArithmeticMachineSimulator arithmeticMachineSimulator = new ArithmeticMachineSimulator();
        UserInterface userInterface = new UserInterface(arithmeticMachineSimulator);

    }

}
