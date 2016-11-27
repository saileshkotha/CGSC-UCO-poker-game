package edu.uco.cs.cowtippingdwarfs.card24;

import java.util.ArrayList;

public class Core {
  
  public static void main(String[] args) {
    System.out.println("Hello, world!");
    
    //ArithmeticMachine arithmeticMachine = new ArithmeticMachine();
    //UserInterface userInterface = new UserInterface(arithmeticMachine);
    
  }

  //private static ArrayList<SolutionSet> solutions = new ArrayList<SolutionSet>();
  
  /*
  private static SolutionSet solutions = null;
  
  private static final String[] possibleRanks = { "Ace",
                                            "Two",
                                            "Three",
                                            "Four",
                                            "Five",
                                            "Six",
                                            "Seven",
                                            "Eight",
                                            "Nine",
                                            "Ten",
                                            "Jack",
                                            "Queen",
                                            "King" };
  
  private static final String[] possibleSuites = { "Spades",
                                             "Hearts",
                                             "Clubs",
                                             "Diamonds" };
  
  private static Card[] currentCards = new Card[4];
  
  public static void main(String[] args) {
    Card[] possibleCards = new Card[52];
    for(int i = 0; i < possibleSuites.length; i++) {
      for(int j = 0; j < possibleRanks.length; j++) {
        possibleCards[i * 13 + j] = new Card(possibleRanks[j] + " of " + possibleSuites[i], j + 1);
      }
    }
    
    int count = 0;
    
    //for(int i = 0; i < possibleCards.length; i++) {
    for(int i = 0; i < 1; i++) {
      boolean first = true;
      for(int j = 0; j < possibleCards.length; j++) {
        if(j == i) continue;
        
        for(int k = 0; k < possibleCards.length; k++) {
          if(k == j || k == i) continue;
          
          for(int l = 0; l < possibleCards.length; l++) {
            if(l == k || l == j || l == i) continue;
            
            currentCards[0] = possibleCards[i];
            currentCards[1] = possibleCards[j];
            currentCards[2] = possibleCards[k];
            currentCards[3] = possibleCards[l];
            
            count++;
            
            for(int m = 0; m < 4; m++) {
              try {
                new CardTree(currentCards[m]);
              } catch(Throwable t) {
                System.out.println("Throwable was, well, thrown.");
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                System.out.println("k = " + k);
                System.out.println("l = " + l);
                System.out.println("m = " + m);
                t.printStackTrace();
                System.exit(1);
              }
            }
            
            if(first) {
              System.out.println("Progress: " + count + " / " + 6497400 + " = " + (int)(count * 100 / 6497400.00) + "%");
              first = false;
            }
          }
        }
      }
    }
    
    System.out.println(count);
    
    try {
      solutions.display();
    } catch(Throwable t) {
      System.out.println("Exception thrown.");
    }
  }
  
  public static void addSolutionSet(OperatorNode[] operatorNodes) {
    if(solutions == null) {
      solutions = new SolutionSet(currentCards, operatorNodes);
    } else {
      solutions.add(new SolutionSet(currentCards, operatorNodes));
      solutions = solutions.getNext();
    }
  }
  
  public static Card getCurrentCard(int index) {
    return currentCards[index];
  }
  */
  
}
