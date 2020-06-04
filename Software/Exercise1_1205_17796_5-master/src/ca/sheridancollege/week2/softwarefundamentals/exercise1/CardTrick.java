/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week2.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author dancye
 */
/**
*@ modifier: navdeepKaur
 id: 991588827
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            int value = (int) (Math.random() * 13 + 1);
            c.setValue(value);
            c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
            magicHand[i] = c;
        }
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 13");
        int num = in.nextInt();
        System.out.println("Enter the suit");
        String suit = input.nextLine();
        
        Card lucky = new Card();
        
        boolean theWinner = false;
        
        for(int n = 0; n < magicHand.length; n++)
        {
            if((magicHand[n].getValue() == numb)&&(magicHand[n].getSuit().equalsIgnoreCase(suit)))
            {
                theWinner = true;
            }
            if(theWinner == true){
                System.out.println("LUCKY DRAW!!!");
            }
            else{
                System.out.println("BETTER LUCK NEXT TIME");
            }
        }
    }
}
    
