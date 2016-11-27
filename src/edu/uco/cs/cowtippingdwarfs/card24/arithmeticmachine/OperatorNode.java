package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private Object parent = null;
  private OpenParanthesis paranthesisChild = null;
  private CardNode cardChild = null;
  
  public OperatorNode(Object parent) {
    this.parent = parent;
    paranthesisChild = new OpenParanthesis(this);
    cardChild = new CardNode(this, getHeight());
  }
  
  public int getHeight() {
    if(parent instanceof Card) {
      return ((CardNode)parent).getHeight();
    } else if(parent instanceof ClosedParanthesis){
      return ((ClosedParanthesis)parent).getHeight();
    } else {
      return 0;
    }
    
  }
  
}
