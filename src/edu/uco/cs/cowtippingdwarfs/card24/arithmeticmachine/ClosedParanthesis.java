package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{

  public ClosedParanthesis(Object parent) {
    super(parent);
  }

  @Override
  public int getHeight() {
    return ((CardNode)parent).getHeight();
  }

}
