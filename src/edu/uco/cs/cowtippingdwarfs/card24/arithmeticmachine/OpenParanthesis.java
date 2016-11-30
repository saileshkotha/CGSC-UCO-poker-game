package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {

  public OpenParanthesis(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    super(cardValues, height, expression + '(', --paranRatio, 0);
    new CardNode(cardValues, getHeight(), this.expression, paranRatio, 0);
  }

  @Override
  public int getHeight() {
    return height;
  }

}
