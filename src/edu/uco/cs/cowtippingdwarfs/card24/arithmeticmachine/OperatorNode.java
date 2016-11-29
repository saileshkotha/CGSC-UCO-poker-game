package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class OperatorNode {
  
  protected Object parent;
  private OpenParanthesis paranthesisChild = null;
  private CardNode cardChild = null;
  private int[] cardValues;
  
  public OperatorNode(Object parent, int[] cardValues) {
    System.out.println("LEVEL " + getHeight() + " CREATED OPERATOR");
    if(parent == null) {
      System.out.println("Seriously, the parent is null.");
    } else {
      System.out.println("The parent is not actually null, it's just not being set properly.");
    }
    this.parent = parent;
    System.out.println("Parent = " + parent.getClass().getName());
    this.cardValues = cardValues;
    paranthesisChild = new OpenParanthesis(this, cardValues);
    cardChild = new CardNode(this, cardValues);
  }
  
  public int getHeight() {
    if(parent instanceof Card) {
      return ((CardNode)parent).getHeight();
    } else if(parent instanceof ClosedParanthesis){
      return ((ClosedParanthesis)parent).getHeight();
    } else {
      System.out.println("PARENT COULD NOT BE DETECTED.");
      if(parent == null) {
        System.out.println("PARENT IS NULL");
      }
      return 0;
    }
  }
  
}
