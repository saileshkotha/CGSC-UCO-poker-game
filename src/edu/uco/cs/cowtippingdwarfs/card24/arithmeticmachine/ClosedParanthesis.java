package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{

  public ClosedParanthesis(Object parent) {
    super(parent);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getHeight() {
    return ((CardNode)parent).getHeight();
  }

}
