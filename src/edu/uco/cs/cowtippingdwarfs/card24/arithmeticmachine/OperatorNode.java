package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private Object parent = null;
  private Object child = null;
  
  public OperatorNode(Object parent) {
    this.parent = parent;
  }
  
  public int getHeight() {
    if(parent instanceof Card) {
      return ((CardNode)parent).getHeight();
    } else if(parent instanceof OpenParanthesis){
      return ((OpenParanthesis)parent).getHeight();
    } else {
      return 0;
    }
  }
  
}
