/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjackGUI;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {

        ///////////// Set the card notation
        char currentSuit = 'X';
        for (int suit = 1; suit <= 4; suit++) {

            if (suit == 1) {
                currentSuit = 's';
            }else if (suit == 2) {
                currentSuit = 'd';
            }else if (suit == 3) {
                currentSuit = 'h';
            }else if (suit == 4) {
                currentSuit = 'c';
            }

            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, currentSuit));
            }
        }
        
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card nextCard() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
