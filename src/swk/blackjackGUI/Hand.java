/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjackGUI;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>();
    private boolean stand = false;
    
    public Hand() {
    }

    void giveCard(Card card) {
        hand.add(card);
    }

 
    public int getPoints() {
        int points = 0;
        int numOfAces = 0;


        for (int card = 0; card < hand.size(); card++) {
            if (hand.get(card).isAce()) {
                numOfAces++;
            } else {
                points += hand.get(card).getPoints();
            }
        }

        
        for (int i = 0; i < numOfAces;i++ ){
            if (points + 11 > 21) {
                    points += 1;
                } else {
                    points += 11;
                }
        }

        return points;
   
   
        
    }

    public boolean isBust(){
           return getPoints() > 21;
    }

    public boolean isBlackjack(){
        return getPoints() == 21;
    }

    public Card getFirstCard(){
        return hand.get(0);
    }
    
    public Card getCardAt(int index){
    	return hand.get(index);
    }
    
    public int getNumberOfCards(){
    	return hand.size();
    }
}
