package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class Paranthesis {
  
  protected int height = 0;
  protected String expression;
  
  public Paranthesis(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    this.height = height;
    this.expression = expression;
  }
  
  public abstract int getHeight();
  
}
