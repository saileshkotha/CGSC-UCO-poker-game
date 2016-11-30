package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ArithmeticMachine {

  Thread cardTreeThread = null;
  CardTree cardTree = null;
  static ScriptEngine scriptEngine = null;

  public static ArrayList<String> combinations = new ArrayList<String>();
  
  public ArithmeticMachine() {
    scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
  }
  
  public void solve(Card[] cards) {
    cardTree = new CardTree(cards);
    cardTreeThread = new Thread(cardTree);
    System.out.println("Started.");
    cardTreeThread.start();
  }
  
  public class CardTree implements Runnable {
    
    int[][] cardValues = new int[24][4];
    
    public CardTree(Card[] cards) {

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
          cardValues[i][j] = cards[cardValues[i][j]].getValue();
        }
      }
    
    }

    @Override
    public void run() {

      for(int i = 0; i < 24; i++) {
        new OpenParanthesis(cardValues[i], -1, "", 0, 0);
        new CardNode(cardValues[i], -1, "", 0, 0);
      }
      System.out.println("Displaying results.");
      displayResults();
      
    }
    
  }
  
  public static void displayResults() {
    try {
      PrintWriter out = new PrintWriter(new File("out.txt"));
      for(int i = 0; i < combinations.size(); i++) {
        try {
          if(Integer.parseInt(scriptEngine.eval(combinations.get(i)).toString()) == 24) {
            System.out.println(combinations.get(i));
          }
        } catch(Exception e) { }
      }
      out.close();
    } catch(Exception e) {
      System.out.println("Error on output.");
    }
  }
  
}
