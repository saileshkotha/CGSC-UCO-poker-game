package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class SolutionSet {
  
  private SolutionSet previous = null;
  private SolutionSet next = null;
  private Card[] cards;
  private char[] operators;
  
  public SolutionSet(Card[] cards, OperatorNode[] operatorNodes) {
    this.cards = new Card[4];
    for(int i = 0; i < cards.length; i++) {
      this.cards[i] = cards[i];
    }
    
    operators = new char[3];
    
    for(int i = 0; i < operatorNodes.length; i++) {
      if(operatorNodes[i] instanceof AdditionOperator) {
        operators[i] = '+';
      } else if(operatorNodes[i] instanceof SubtractionOperator) {
        operators[i] = '-';
      } else if(operatorNodes[i] instanceof MultiplicationOperator) {
        operators[i] = 'x';
      } else if(operatorNodes[i] instanceof DivisionOperator) {
        operators[i] = '/';
      }
    }

  }
  
  public void add(SolutionSet solutionSet) {
    solutionSet.setPrevious(this);
    next = solutionSet;
  }
  
  public void display() {
    System.out.println(cards[0].getValue() + " " + operators[0] + " " +
                       cards[1].getValue() + " " + operators[1] + " " +
                       cards[2].getValue() + " " + operators[2] + " " +
                       cards[3].getValue());
    if(previous != null) {
      previous.display();
    }
  }
  
  public SolutionSet getPrevious() {
    return previous;
  }
  
  public void setPrevious(SolutionSet previous) {
    this.previous = previous;
  }
  
  public SolutionSet getNext() {
    return next;
  }
  
}
