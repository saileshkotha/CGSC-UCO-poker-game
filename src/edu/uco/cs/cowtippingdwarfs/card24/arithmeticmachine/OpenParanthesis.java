package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {
  
  private CardNode cardChild = null;

  public OpenParanthesis(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '(');
    cardChild = new CardNode(cardValues, getHeight(), this.expression);
  }

  @Override
  public int getHeight() {
    return height;
  }

}
