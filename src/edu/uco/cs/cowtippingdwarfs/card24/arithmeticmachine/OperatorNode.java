package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private int height = 0;
  protected String expression;
  
  public OperatorNode(int[] cardValues, int height, String expression) {
    this.height = height;
    new OpenParanthesis(cardValues, height, expression);
    new CardNode(cardValues, height, expression);
  }
  
  public int getHeight() {
    return height;
  }
  
}
