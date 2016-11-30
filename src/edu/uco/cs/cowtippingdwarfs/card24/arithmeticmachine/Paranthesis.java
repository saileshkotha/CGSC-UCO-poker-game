package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public abstract class Paranthesis {
  
  protected Object parent = null;
  protected Object child = null;
  
  public Paranthesis(Object parent) {
    this.parent = parent;
  }
  
  public abstract int getHeight();
  
}
