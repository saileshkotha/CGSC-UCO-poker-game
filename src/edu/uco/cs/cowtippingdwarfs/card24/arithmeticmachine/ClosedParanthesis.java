package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

import edu.uco.cs.cowtippingdwarfs.card24.Core;

public class ClosedParanthesis extends Paranthesis{
  
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 

  public ClosedParanthesis(int[] cardValues, int height, String expression) {
    
    super(cardValues, height, expression + ')');
    
    if(getHeight() < 3) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(cardValues, height, this.expression);
      operatorChildren[1] = new DivisionOperator(cardValues, height, this.expression);
      operatorChildren[2] = new MultiplicationOperator(cardValues, height, this.expression);
      operatorChildren[3] = new SubtractionOperator(cardValues, height, this.expression);
    } else { //add code here to add combination to stack
      Core.combinations.add(expression);
    }
    
  }

  @Override
  public int getHeight() {
    return height;
  }

}
