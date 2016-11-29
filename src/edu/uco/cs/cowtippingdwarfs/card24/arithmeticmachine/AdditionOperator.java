package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class AdditionOperator extends OperatorNode {
  
  Object parent = null;

  public AdditionOperator(Object parent, int[] cardValues) {
    super(parent, cardValues);
    this.parent = parent;
  }

  /*
  @Override
  public double performOperation(CardTree card) {
    return parent.getData() + card.getData();
  }
  */
  
  @Override
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
