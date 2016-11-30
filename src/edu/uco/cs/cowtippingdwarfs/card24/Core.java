package edu.uco.cs.cowtippingdwarfs.card24;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.ArithmeticMachine;
import edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine.Card;

public class Core {
  
  public static ArrayList<String> combinations = new ArrayList<String>();
  
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
  
  public static void displayResults() {
    try {
      PrintWriter out = new PrintWriter(new File("out.txt"));
      for(int i = 0; i < combinations.size(); i++) {
        //System.out.println(combinations.get(i));
        out.println(combinations.get(i));
      }
      out.close();
    } catch(Exception e) {
      System.out.println("Error on output.");
    }
  }
  
}
