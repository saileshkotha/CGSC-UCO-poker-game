package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ArithmeticMachine {

  Thread cardTreeThread = null;
  CardTree cardTree = null;
  
  public void solve(Card[] cards) {
    cardTree = new CardTree(cards);
    cardTreeThread = new Thread(cardTree);
  }
  
  public class CardTree implements Runnable {
    
    Card[] cards;
    
    public CardTree(Card[] cards) {
      this.cards = cards;
    }
    
    OpenParanthesis firstTree = null;
    CardNode secondTree = null;

    @Override
    public void run() {
      firstTree = new OpenParanthesis(this);
      secondTree = new CardNode(this, cards[0].getValue());
    }
    
  }
  
}
