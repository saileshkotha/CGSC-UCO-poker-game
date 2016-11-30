package edu.uco.cs.cowtippingdwarfs.card24;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.Card;

public class Core {
  
  public static void main(String[] args) {
    ArithmeticMachine arithmeticMachine = new ArithmeticMachine();
    
    //SIMULATE USERINTERFACE BUT REMOVE LATER
    
    int[] cardValues = { 3, 5, 8, 7 };
    Card[] cards = new Card[4];
    for(int i = 0; i < 4; i++) {
      cards[i] = new Card(cardValues[i]);
    }

    arithmeticMachine.solve(cards);
    
    //END SIMULATION

    //UserInterface userInterface = new UserInterface(arithmeticMachine);
    
  }
  
}
