package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{
  
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 

  public ClosedParanthesis(Object parent, int[] cardValues) {
    
    super(parent, cardValues);
    
    System.out.println("LEVEL " + getHeight() + " CREATED CLOSED PARAN");
    
    if(getHeight() < 4) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(this, cardValues);
      operatorChildren[1] = new DivisionOperator(this, cardValues);
      operatorChildren[2] = new MultiplicationOperator(this, cardValues);
      operatorChildren[3] = new SubtractionOperator(this, cardValues);
    } else { //add code here to add combination to stack
      
    }
    
  }

  @Override
  public int getHeight() {
    return ((CardNode)parent).getHeight();
  }

}
