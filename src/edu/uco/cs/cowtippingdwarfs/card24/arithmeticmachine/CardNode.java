package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardNode {

  private ClosedParanthesis paranthesisChild = null;
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 
  private int value = 0;
  private int height = 0;
  
  public CardNode(int[] cardValues, int height) {
    
    this.height = ++height;
    value = cardValues[height];
    
    System.out.println("LEVEL " + height + " CREATED CARD");
    
    paranthesisChild = new ClosedParanthesis(cardValues, height); //generate a closed paranthesis
    
    if(height < 3) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(cardValues, height);
      operatorChildren[1] = new DivisionOperator(cardValues, height);
      operatorChildren[2] = new MultiplicationOperator(cardValues, height);
      operatorChildren[3] = new SubtractionOperator(cardValues, height);
    } else { //add code here to add combination to stack
      
    }
    
  }
  
  public int getHeight() {
    return height;
  }
  
  public int getValue() {
    return value;
  }
  
}
