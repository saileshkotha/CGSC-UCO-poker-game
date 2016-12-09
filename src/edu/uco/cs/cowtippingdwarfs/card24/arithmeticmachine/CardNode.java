package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class CardNode {

  private int value = 0;
  private int height = 0;

  public CardNode(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {

    this.height = ++height;
    paranSpacing++;
    value = cardValues[height];
    expression += Integer.toString(value);

    if (height < 3) { // create branches for operators if necessary
      new AdditionOperator(cardValues, height, expression, paranRatio, paranSpacing);
      new DivisionOperator(cardValues, height, expression, paranRatio, paranSpacing);
      new MultiplicationOperator(cardValues, height, expression, paranRatio, paranSpacing);
      new SubtractionOperator(cardValues, height, expression, paranRatio, paranSpacing);
      new ClosedParanthesis(cardValues, height, expression, paranRatio, paranSpacing); // generate
                                                                                       // a
                                                                                       // closed
                                                                                       // paranthesis
    } else { // add code here to add combination to results if and only if we
             // have an appropriate number of parantheses
      if (paranRatio == 0) { // if there are an equal number of open and closed
                             // parans
        ArithmeticMachine.addPossibleSolution(expression);
      } else if (paranRatio == -1 && paranSpacing > 1) { // if there is exactly
                                                         // one unmatched closed
                                                         // paran
        ArithmeticMachine.addPossibleSolution(expression + ')');
      }
    }

  }

  public int getHeight() {
    return height;
  }

  public int getValue() {
    return value;
  }

}
