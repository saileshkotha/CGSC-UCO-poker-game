package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class SubtractionOperator extends OperatorNode {

  public SubtractionOperator(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '-');
  }

}
