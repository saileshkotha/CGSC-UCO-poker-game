package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {

  private int height = 0;
  protected String expression;

  public OperatorNode(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    this.height = height;
    paranSpacing++;
    new OpenParanthesis(cardValues, height, expression, paranRatio, paranSpacing);
    new CardNode(cardValues, height, expression, paranRatio, paranSpacing);
  }

  public int getHeight() {
    return height;
  }

}
