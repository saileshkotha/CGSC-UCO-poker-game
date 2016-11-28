package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{

  public ClosedParanthesis(Object parent, int[] cardValues) {
    super(parent, cardValues);
  }

  @Override
  public int getHeight() {
    return ((CardNode)parent).getHeight();
  }

}
