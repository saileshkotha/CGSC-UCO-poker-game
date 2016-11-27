package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ArithmeticMachine {
  
  OpenParanthesis firstTree = null;
  CardNode secondTree = null;
  
  ArithmeticMachine(Card[] cards) {
    firstTree = new OpenParanthesis(this);
    secondTree = new CardNode(this, cards[0].getValue());
  }
  
}
