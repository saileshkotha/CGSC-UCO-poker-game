package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class AdditionOperator extends OperatorNode {
  
  public AdditionOperator(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '+');
  }

}
