package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardNode {

  private Object parent = null;
  private Object child = null;
  private int value = 0;
  private int height = 0;
  
  public CardNode(Object parent, Card card) {
    this.parent = parent;
    value = card.getValue();
    
    if(parent instanceof Paranthesis) {
      height = ((Paranthesis)parent).getHeight();
    } else if(parent instanceof OperatorNode) {
      height = ((OperatorNode)parent).getHeight();
    }
    
  }
  
  public int getHeight() {
    return height;
  }
  
}
