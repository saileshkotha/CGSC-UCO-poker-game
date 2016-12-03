package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import edu.uco.cs.cowtippingdwarfs.card24.userinterface.UserInterface;

public class ArithmeticMachine {

  static UserInterface userInterface = null;
  static ScriptEngine scriptEngine = null;
  static boolean solutionsExist = false;
  
  Thread cardTreeThread = null;
  CardTree cardTree = null;

  public ArithmeticMachine() {
    scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
  }
  
  public void solve(int[] cards, UserInterface userInterface) {
    ArithmeticMachine.userInterface = userInterface;
    cardTree = new CardTree(cards);
    cardTreeThread = new Thread(cardTree);
    System.out.println("Started.");
    cardTreeThread.start();
  }
  
  public class CardTree implements Runnable {
    
    int[][] cardValues = new int[24][4];
    
    public CardTree(int[] cards) {

      for(int i = 0; i < 24; i++) { //generate first column of indexes
        cardValues[i][0] = i / 6;
      }
      
      for(int i = 0; i < 4; i++) { //generate second column of indexes
        for(int j = 0, k = 0; j < 6; j += 2, k++) {
          if(cardValues[6 * i + j][0] == k) k++;
          cardValues[6 * i + j][1] = cardValues[6 * i + j + 1][1] = k;
        }
      }
      
      for(int i = 0; i < 12; i++) { //generate third column of indexes
        for(int j = 0, k = 0; j < 2; j++, k++) {
          if(cardValues[2 * i + j][0] == k) k++;
          if(cardValues[2 * i + j][1] == k) {
            if(cardValues[2 * i + j][0] == ++k) k++;
          }
          cardValues[2 * i + j][2] = k;
        }
      }
      
      for(int i = 0; i < 24; i++) { //generate fourth column of indexes
        cardValues[i][3] = 6 - cardValues[i][2] - cardValues[i][1] - cardValues[i][0];
      }
      
      for(int i = 0; i < 24; i++) { //replace indexes with values;
        for(int j = 0; j < 4; j++) {
          cardValues[i][j] = cards[cardValues[i][j]];
        }
      }
    
    }

    @Override
    public void run() {

      for(int i = 0; i < 24; i++) { //run all combinations through the two trees... one with an open paran, one without
        new OpenParanthesis(cardValues[i], -1, "", 0, 0);
        new CardNode(cardValues[i], -1, "", 0, 0);
      }
      
    }
    
  }
  
  public static void addPossibleSolution(String possibleSolution) {
    try {
      if(Integer.parseInt(scriptEngine.eval(possibleSolution).toString()) == 24) {
        solutionsExist = true;
        userInterface.addSolution(possibleSolution, "NULL"); //TODO add a time soon
      }
    } catch(Exception e) { } //do nothing if there's an exception, it means that there was most likely a fraction (which is not 24)
  }
  
  public static void done() {
    if(!solutionsExist) {
      userInterface.notifyOfNoSolution();
    }
  }
  
}
