package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private OpenParanthesis paranthesisChild = null;
  private CardNode cardChild = null;
  private int[] cardValues;
  private int height = 0;
  
  public OperatorNode(int[] cardValues, int height) {
    this.height = height;
    this.cardValues = cardValues;
    System.out.println("LEVEL " + height + " CREATED OPERATOR");
    paranthesisChild = new OpenParanthesis(cardValues, height);
    cardChild = new CardNode(cardValues, height);
  }
  
  public int getHeight() {
    return height;
  }
  
}
