package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{
  
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 

  public ClosedParanthesis(int[] cardValues, int height) {
    
    super(cardValues, height);
    
    System.out.println("LEVEL " + getHeight() + " CREATED CLOSED PARAN");
    
    if(getHeight() < 3) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(cardValues, height);
      operatorChildren[1] = new DivisionOperator(cardValues, height);
      operatorChildren[2] = new MultiplicationOperator(cardValues, height);
      operatorChildren[3] = new SubtractionOperator(cardValues, height);
    } else { //add code here to add combination to stack
      
    }
    
  }

  @Override
  public int getHeight() {
    return height;
  }

}
