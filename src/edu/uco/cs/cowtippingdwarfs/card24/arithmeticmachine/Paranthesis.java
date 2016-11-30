package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class Paranthesis {
  
  protected Object child = null;
  protected int[] cardValues;
  protected int height = 0;
  protected String expression;
  
  public Paranthesis(int[] cardValues, int height, String expression) {
    this.height = height;
    this.cardValues = cardValues;
    this.expression = expression;
  }
  
  public abstract int getHeight();
  
}
