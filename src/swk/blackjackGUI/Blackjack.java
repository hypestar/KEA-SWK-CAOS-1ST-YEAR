package swk.blackjackGUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Blackjack {

	private BlackJackFrame GUI;
	private Deck deck;
	private Hand player;
	private Hand dealer;
	private int playerNumOfWins = 0;
	private int dealerNumOfWins = 0;
	private boolean playerWon;


	public Blackjack(BlackJackFrame GUI) {
		this.GUI = GUI;
	}

	public void deal() {

		clearTable();
		
		GUI.btnDeal.setEnabled(false);
		GUI.btnHit.setEnabled(true);
		GUI.btnStand.setEnabled(true);

		dealer = new Hand();
		player = new Hand();

		deck = new Deck();
		deck.shuffle();

		player.giveCard(deck.nextCard());
		player.giveCard(deck.nextCard());

		dealer.giveCard(deck.nextCard());
		dealer.giveCard(deck.nextCard());

		GUI.playerHand.get(0).setIcon(player.getCardAt(0).getCardImage());
		GUI.playerHand.get(1).setIcon(player.getCardAt(1).getCardImage());

		GUI.dealerHand.get(0).setIcon(dealer.getCardAt(0).getCardImage());
		GUI.dealerHand.get(1).setIcon(new ImageIcon(BlackJackFrame.class.getResource("/dk/hypestar/exercises/blackjackGUI/cards/back.png")));
		updatePlayerScore();

		if(player.isBlackjack()){
			dealerAI(); //If you got blackjack then it's the dealers turn.
		}

	}

	public void hit(boolean isDealer){

		if (isDealer){
			dealer.giveCard(deck.nextCard());
			GUI.dealerHand.get(dealer.getNumberOfCards()-1).setIcon(dealer.getCardAt(dealer.getNumberOfCards()-1).getCardImage());
			updateDealerScore();
		}else {		
			player.giveCard(deck.nextCard());
			GUI.playerHand.get(player.getNumberOfCards()-1).setIcon(player.getCardAt(player.getNumberOfCards()-1).getCardImage());
			updatePlayerScore();
			if(player.isBust() || player.isBlackjack()){
				dealerAI(); //dealers turn
			}
		}
	}


	void clearTable(){

		//reset scores
		clearScores();

		//clear the winner label
		GUI.lblWinner.setText(null);

		// remove the players cards from the table
		for(int card = 0;card < GUI.playerHand.size();card++){
			GUI.playerHand.get(card).setIcon(null);
		}
		// remove the dealers cards from the table
		for(int card = 0;card < GUI.dealerHand.size();card++){
			GUI.dealerHand.get(card).setIcon(null);
		}


	}

	void declareWinner(){
		if (dealer.isBust()) {
			playerNumOfWins++;
			playerWon = true;
		}else if (player.isBust() ) {
			dealerNumOfWins++;
			playerWon = false;
		} else {
			dealerNumOfWins++;
			playerWon = false;
		}
		if (playerWon){
			GUI.lblWinner.setText("You Win!");
		}else{
			GUI.lblWinner.setText("You Lose!");
		}

	}

	private void updatePlayerScore(){
		GUI.playerScoreLabel.setText(Integer.toString(player.getPoints()));
	}

	private void updateDealerScore(){
		GUI.dealerScoreLabel.setText(Integer.toString(dealer.getPoints()));
	}

	private void clearScores(){
		GUI.playerScoreLabel.setText("");
		GUI.dealerScoreLabel.setText("");
	}




	void dealerAI() {

		// Disable the players buttons
		GUI.btnHit.setEnabled(false);
		GUI.btnStand.setEnabled(false);
		
		boolean stand = false;
		// Flip second card.
		GUI.dealerHand.get(1).setIcon(dealer.getCardAt(1).getCardImage());

		updateDealerScore();

		while (!dealer.isBust() && !player.isBust() && !stand) {

			if (dealer.getPoints() < player.getPoints()) {
				hit(true);
			} else {
				stand = true;
			}
		}
		declareWinner();
		GUI.btnDeal.setEnabled(true);

	}

	void pause(int milliseconds){
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
