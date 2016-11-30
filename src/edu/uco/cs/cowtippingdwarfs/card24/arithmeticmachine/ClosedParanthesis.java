package edu.uco.cs.cowtippingdwarfs.card24.arithmeticmachine;

public class ClosedParanthesis extends Paranthesis{

  public ClosedParanthesis(int[] cardValues, int height, String expression, int paranRatio, int paranSpacing) {
    
    super(cardValues, height, expression + ')', ++paranRatio, ++paranSpacing);
    
    if(paranRatio < 0 && paranSpacing > 1) { //make sure that there are an appropriate number of matching parantheses so far and parans are around more than one symbol
      new AdditionOperator(cardValues, height, this.expression, paranRatio, paranSpacing);
      new DivisionOperator(cardValues, height, this.expression, paranRatio, paranSpacing);
      new MultiplicationOperator(cardValues, height, this.expression, paranRatio, paranSpacing);
      new SubtractionOperator(cardValues, height, this.expression, paranRatio, paranSpacing);
    }
    
  }

  @Override
  public int getHeight() {
    return height;
  }

}
