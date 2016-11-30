package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

import edu.uco.cs.cowtippingdwarfs.card24.Core;

public class CardNode {

  private int value = 0;
  private int height = 0;
  
  public CardNode(int[] cardValues, int height, String expression) {
    
    this.height = ++height;
    value = cardValues[height];
    expression += Integer.toString(value);
    
    if(height < 3) { //create branches for operators if necessary
      new AdditionOperator(cardValues, height, expression);
      new DivisionOperator(cardValues, height, expression);
      new MultiplicationOperator(cardValues, height, expression);
      new SubtractionOperator(cardValues, height, expression);
      new ClosedParanthesis(cardValues, height, expression); //generate a closed paranthesis
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
