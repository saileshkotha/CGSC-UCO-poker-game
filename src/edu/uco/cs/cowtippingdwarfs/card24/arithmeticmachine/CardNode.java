package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

import edu.uco.cs.cowtippingdwarfs.card24.Core;

public class CardNode {

  private ClosedParanthesis paranthesisChild = null;
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 
  private int value = 0;
  private int height = 0;
  
  public CardNode(int[] cardValues, int height, String expression) {
    
    this.height = ++height;
    value = cardValues[height];
    expression += Integer.toString(value);
    
    if(height < 3) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(cardValues, height, expression);
      operatorChildren[1] = new DivisionOperator(cardValues, height, expression);
      operatorChildren[2] = new MultiplicationOperator(cardValues, height, expression);
      operatorChildren[3] = new SubtractionOperator(cardValues, height, expression);
      paranthesisChild = new ClosedParanthesis(cardValues, height, expression); //generate a closed paranthesis
    } else { //add code here to add combination to stack
      Core.combinations.add(expression); //without ending paran
      Core.combinations.add(expression + ')'); //with ending paran
    }
    
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getValue() {
    return value;
  }
  
}
