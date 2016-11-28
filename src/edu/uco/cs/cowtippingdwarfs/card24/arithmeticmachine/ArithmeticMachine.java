package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ArithmeticMachine {

  Thread cardTreeThread = null;
  CardTree cardTree = null;
  
  public void solve(Card[] cards) {
    cardTree = new CardTree(cards);
    cardTreeThread = new Thread(cardTree);
    cardTreeThread.start();
  }
  
  public class CardTree implements Runnable {
    
    int[] cardValues;
    
    public CardTree(Card[] cards) {
      cardValues = new int[cards.length];
      for(int i = 0; i < cards.length; i++) {
        cardValues[i] = cards[i].getValue();
      }
    }
    
    OpenParanthesis firstTree = null;
    CardNode secondTree = null;

    @Override
    public void run() {

      firstTree = new OpenParanthesis(this, cardValues);
      secondTree = new CardNode(this, cardValues);
      
    }
    
  }
  
}
