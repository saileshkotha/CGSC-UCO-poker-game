package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {

  public OpenParanthesis(Object parent) {
    super(parent);
  }

  @Override
  public int getHeight() {
    return ((OperatorNode)parent).getHeight();    
  }

}
