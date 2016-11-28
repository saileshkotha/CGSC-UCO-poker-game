package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  private Object parent = null;
  private OpenParanthesis paranthesisChild = null;
  private CardNode cardChild = null;
  private int[] cardValues;
  
  public OperatorNode(Object parent, int[] cardValues) {
    this.parent = parent;
    this.cardValues = cardValues;
    paranthesisChild = new OpenParanthesis(this, cardValues);
    cardChild = new CardNode(this, cardValues); //FIXME the error is here, change getHeight() to cards[getHeight()] or something
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
