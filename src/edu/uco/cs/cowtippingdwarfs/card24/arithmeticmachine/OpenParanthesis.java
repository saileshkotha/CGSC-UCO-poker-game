package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {
  
  private CardNode cardChild = null;

  public OpenParanthesis(Object parent, int[] cardValues) {
    super(parent, cardValues);
    
    System.out.println("LEVEL " + getHeight() + " CREATED CLOSED PARAN");
    
    cardChild = new CardNode(this, cardValues);
  }

  @Override
  public int getHeight() {
    return (parent instanceof OperatorNode) ? ((OperatorNode)parent).getHeight() : 0;
  }

}
