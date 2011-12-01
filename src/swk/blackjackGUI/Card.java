package swk.blackjackGUI;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Card {

    private int cardNum;
    private int points = 0;
    private boolean ace = false;
    private ImageIcon cardImage;

    Card(int cardNum, char suit) {

        if (cardNum == 1) {
            points = 11;
            ace = true;
        } else if (cardNum == 11) {
            points = 10;
        } else if (cardNum == 12) {
            points = 10;
        } else if (cardNum == 13) {
            points = 10;
        } else {
            points = cardNum;
        }

        cardImage = new ImageIcon(Card.class.getResource("/dk/hypestar/exercises/blackjackGUI/cards/" + Integer.toString(cardNum) + suit + ".png"));
    }

    
    public int getPoints() {
        return points;
    }

    public boolean isAce() {
        {
            return ace;
        }
    }
    
    public ImageIcon getCardImage(){
    	return cardImage;
    }
}
