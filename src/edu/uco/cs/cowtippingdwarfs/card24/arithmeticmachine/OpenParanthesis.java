package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class OpenParanthesis extends Paranthesis {
  
  private CardNode cardChild = null;

  public OpenParanthesis(int[] cardValues, int height) {
    super(cardValues, height);
    
    System.out.println("LEVEL " + getHeight() + " CREATED OPEN PARAN");
    
    cardChild = new CardNode(cardValues, getHeight());
  }

  @Override
  public int getHeight() {
    return height;
  }

}
