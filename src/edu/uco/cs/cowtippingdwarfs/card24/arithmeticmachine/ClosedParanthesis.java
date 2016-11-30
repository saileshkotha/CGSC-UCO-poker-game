package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{

  public ClosedParanthesis(int[] cardValues, int height, String expression) {
    
    super(cardValues, height, expression + ')');
    
    new AdditionOperator(cardValues, height, this.expression);
    new DivisionOperator(cardValues, height, this.expression);
    new MultiplicationOperator(cardValues, height, this.expression);
    new SubtractionOperator(cardValues, height, this.expression);
    
  }

  @Override
  public int getHeight() {
    return height;
  }

}
