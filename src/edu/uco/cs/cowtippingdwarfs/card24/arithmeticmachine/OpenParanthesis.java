package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {

  public OpenParanthesis(Object parent) {
    super(parent);
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getHeight() {
    return ((OperatorNode)parent).getHeight();    
  }

}
