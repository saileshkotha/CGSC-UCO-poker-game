package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {

  public OpenParanthesis(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '(');
    new CardNode(cardValues, getHeight(), this.expression);
  }

  @Override
  public int getHeight() {
    return height;
  }

}
