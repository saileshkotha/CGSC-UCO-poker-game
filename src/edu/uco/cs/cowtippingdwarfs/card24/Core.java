package edu.uco.cs.cowtippingdwarfs.card24;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import edu.uco.cs.cowtippingdwarfs.card24.userinterface.UserInterface;

public class Core {
  
  public static void main(String[] args) {
    ArithmeticMachine arithmeticMachine = new ArithmeticMachine();
    @SuppressWarnings("unused")
    UserInterface userInterface = new UserInterface(arithmeticMachine);
  }
  
}
