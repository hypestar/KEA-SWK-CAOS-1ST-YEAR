/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjack;

import java.util.ArrayList;

import swk.blackjackGUI.Card;


public class Hand {

    private ArrayList<Card> hand = new ArrayList<Card>();
    private boolean bust = false;
    private boolean blackjack = false;
    private boolean stand = false;
    private int points = 0;

    public Hand() {
    }

    void giveCard(Card card) {
        hand.add(card);
        calcPoints();
    }

    public String toString() {
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < hand.size(); i++) {
            s.append(hand.get(i) + " ");
        }
        return s.toString();
    }

    private void calcPoints() {
        points = 0;
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

        if (points > 21){bust = true;}
        if (points == 21){blackjack = true;}
    }

    public boolean isBust(){
        return bust;
    }

    public boolean isBlackjack(){
        return blackjack;
    }

    public int getPoints(){
        return points;
    }

    public void setStand(boolean stand){
        this.stand = stand;
    }

    public boolean isStand() {
        return stand;
    }

    public Card getFirstCard(){
        return hand.get(0);
    }
    
    public boolean isFiveCards(){
    	return hand.size() == 5;
    }

}
