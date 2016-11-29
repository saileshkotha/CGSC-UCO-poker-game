package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardNode {

  private Object parent = null;
  private ClosedParanthesis paranthesisChild = null;
  private OperatorNode operatorChildren[] = new OperatorNode[4]; 
  private int value = 0;
  private int height = 0;
  
  public CardNode(Object parent, int[] cardValues) {
    
    this.parent = parent;
    
    if(parent instanceof Paranthesis) {
      System.out.println("PARAN DETECTED, ORIGINAL HEIGHT = " + ((Paranthesis)parent).getHeight());
      height = ((Paranthesis)parent).getHeight() + 1;
    } else if(parent instanceof OperatorNode) {
      System.out.println("OPERATOR DETECTED, ORIGINAL HEIGHT = " + ((OperatorNode)parent).getHeight());
      height = ((OperatorNode)parent).getHeight() + 1;
    } else {
      System.out.println("NO OBJECT DETECTED, ORIGINAL HEIGHT = 0");
    }
    
    System.out.println("LEVEL " + height + " CREATED CARD");
    
    System.out.println("CHECKPOINT 1");
    
    value = cardValues[height];
    
    System.out.println("CHECKPOINT 2");
    
    paranthesisChild = new ClosedParanthesis(this, cardValues); //generate a closed paranthesis
    
    System.out.println("CHECKPOINT 3");
    
    if(height < 4) { //create branches for operators if necessary
      operatorChildren[0] = new AdditionOperator(this, cardValues);
      operatorChildren[1] = new DivisionOperator(this, cardValues);
      operatorChildren[2] = new MultiplicationOperator(this, cardValues);
      operatorChildren[3] = new SubtractionOperator(this, cardValues);
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
