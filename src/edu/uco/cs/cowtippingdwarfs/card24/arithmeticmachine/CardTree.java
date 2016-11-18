package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardTree {
  
  OpenParanthesis firstTree = null;
  CardNode secondTree = null;
  
  CardTree(Card[] cards) {
    firstTree = new OpenParanthesis(this);
    secondTree = new CardNode(this, cards[0]);
  }
  
}
