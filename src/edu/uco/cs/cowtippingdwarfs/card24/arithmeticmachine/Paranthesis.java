package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class Paranthesis {
  
  protected Object parent = null;
  protected Object child = null;
  protected int[] cardValues;
  
  public Paranthesis(Object parent, int[] cardValues) {
    this.parent = parent;
    this.cardValues = cardValues;
  }
  
  public abstract int getHeight();
  
}
