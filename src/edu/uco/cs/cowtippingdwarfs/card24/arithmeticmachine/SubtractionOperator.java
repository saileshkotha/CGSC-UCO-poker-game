package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class SubtractionOperator extends OperatorNode {

  public SubtractionOperator(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    super(cardValues, height, expression + '-', paranRatio, paranSpacing);
  }

}
