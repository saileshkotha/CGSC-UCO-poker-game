package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class Paranthesis {
  
  protected Object child = null;
  protected int[] cardValues;
  protected int height = 0;
  
  public Paranthesis(int[] cardValues, int height) {

    this.height = height;
    this.cardValues = cardValues;
  }
  
  public abstract int getHeight();
  
}
