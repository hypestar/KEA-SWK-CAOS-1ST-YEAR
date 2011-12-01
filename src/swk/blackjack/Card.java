package swk.blackjack;

public class Card {

    int cardNum;
    String cardName = "";
    int points = 0;
    boolean ace = false;

    Card(int cardNum, char suit) {


        if (cardNum == 1) {
            cardName = "A";
            points = 11;
            ace = true;
        } else if (cardNum == 11) {
            cardName = "J";
            points = 10;
        } else if (cardNum == 12) {
            cardName = "Q";
            points = 10;
        } else if (cardNum == 13) {
            cardName = "K";
            points = 10;
        } else {
            cardName = Integer.toString(cardNum);
            points = cardNum;
        }

        cardName += suit;

    }

    @Override
    public String toString() {
        return cardName;
    }

    int getPoints() {
        return points;
    }

    boolean isAce() {
        {
            return ace;
        }

    }
}
