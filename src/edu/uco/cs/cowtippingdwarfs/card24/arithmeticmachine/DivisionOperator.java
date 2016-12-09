package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class DivisionOperator extends OperatorNode {

  public DivisionOperator(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    super(cardValues, height, expression + '/', paranRatio, paranSpacing);
  }

}
