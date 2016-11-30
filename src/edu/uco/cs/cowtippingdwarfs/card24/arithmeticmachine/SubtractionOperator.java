package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class SubtractionOperator extends OperatorNode {
  
  Object parent = null;

  public SubtractionOperator(int[] cardValues, int height, String expression) {
    super(cardValues, height, expression + '-');
  }
  
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
