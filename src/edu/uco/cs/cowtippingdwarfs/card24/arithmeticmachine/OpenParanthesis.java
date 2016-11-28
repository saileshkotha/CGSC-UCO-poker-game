package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {

  public OpenParanthesis(Object parent, int[] cardValues) {
    super(parent, cardValues);
  }

  @Override
  public int getHeight() {
    return (parent instanceof OperatorNode) ? ((OperatorNode)parent).getHeight() : 0;
  }

}
