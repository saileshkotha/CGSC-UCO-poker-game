package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardNode {

  private Object parent = null;
  private ClosedParanthesis paranthesisChild = null;
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 
  private int value = 0;
  private int height = 0;
  
  public CardNode(Object parent, int value) {
    this.parent = parent;
    this.value = value;
    
    if(parent instanceof Paranthesis) {
      height = ((Paranthesis)parent).getHeight() + 1;
    } else if(parent instanceof OperatorNode) {
      height = ((OperatorNode)parent).getHeight() + 1;
    }
    
    paranthesisChild = new ClosedParanthesis(this); //generate a closed paranthesis
    
    if(height < 4) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(this);
      operatorChildren[1] = new DivisionOperator(this);
      operatorChildren[2] = new MultiplicationOperator(this);
      operatorChildren[3] = new SubtractionOperator(this);
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
