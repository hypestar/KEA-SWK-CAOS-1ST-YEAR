/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjack;

import java.util.ArrayList;
import java.util.Collections;

import swk.blackjackGUI.Card;


/**
 *
 * @author hypestar
 */
public class Deck {

    private ArrayList<Card> deck = new ArrayList<Card>();

    public Deck() {

        ///////////// Set the card notation
        char currentSuit = 'X';
        for (int suits = 1; suits <= 4; suits++) {

            if (suits == 1) {
                currentSuit = '\u2660';
            }
            if (suits == 2) {
                currentSuit = '\u2663';
            }
            if (suits == 3) {
                currentSuit = '\u2665';
            }
            if (suits == 4) {
                currentSuit = '\u2666';
            }

            for (int i = 1; i <= 13; i++) {
                deck.add(new Card(i, currentSuit));
            }
        }
        shuffle();
    }

    void shuffle() {
        Collections.shuffle(deck);
    }

    Card takeCard() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }
}
