package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class MultiplicationOperator extends OperatorNode {

  public MultiplicationOperator(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '*');
  }

  /*
  @Override
  public double performOperation(CardTree card) {
    return parent.getData() * card.getData();
  }
  */

}
