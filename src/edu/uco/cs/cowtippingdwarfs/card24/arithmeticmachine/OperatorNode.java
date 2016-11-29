package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private OpenParanthesis paranthesisChild = null;
  private CardNode cardChild = null;
  private int[] cardValues;
  private int height = 0;
  protected String expression;
  
  public OperatorNode(int[] cardValues, int height, String expression) {
    this.height = height;
    this.cardValues = cardValues;
    paranthesisChild = new OpenParanthesis(cardValues, height, expression);
    cardChild = new CardNode(cardValues, height, expression);
  }
  
  public int getHeight() {
    return height;
  }
  
}
