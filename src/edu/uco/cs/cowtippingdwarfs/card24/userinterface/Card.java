
package edu.uco.cs.cowtippingdwarfs.card24;

import javafx.scene.image.Image;

/**
 *
 * @author CameronLlewellyn
 */

public class Card {
   
   public final static int SPADES = 0;
   public final static int HEARTS = 1;
   public final static int DIAMONDS = 2;
   public final static int CLUBS = 3;
   
   
   public final static int ACE = 1;      
   public final static int JACK = 11;     
   public final static int QUEEN = 12;   
   public final static int KING = 13;
 
   private final int suit; 
   
   private Image cardImage;
  
   private final int value;
  
   public Card(int theValue, int theSuit) {
      value = theValue;
      suit = theSuit;
   }

   public int getSuit() {
      return suit;
   }
  
   public int getValue() {
      return value;
   }
   
   public Image getImage(){
       return this.cardImage;
   }
   /**
    * Returns a String representation of the card's value.
    * @return for a regular card, one of the strings "Ace", "2",
    * "3", ..., "10", "Jack", "Queen", or "King".  
    */
   public String getValueAsString() {
         switch ( value ) {
         case 1:   return "Ace";
         case 2:   return "2";
         case 3:   return "3";
         case 4:   return "4";
         case 5:   return "5";
         case 6:   return "6";
         case 7:   return "7";
         case 8:   return "8";
         case 9:   return "9";
         case 10:  return "10";
         case 11:  return "Jack";
         case 12:  return "Queen";
         default:  return "King";
         }
      }
} 


