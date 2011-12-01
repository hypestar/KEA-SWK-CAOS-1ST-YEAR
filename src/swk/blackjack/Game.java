/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjack;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game {

    public static final int DEALER = 0;
    public static final int PLAYER = 1;
    public static final int UNSETTLED = 2;


    private Deck deck = new Deck();
    private Hand dealer = new Hand();
    private Hand player = new Hand();
    private boolean dealersTurn = false;
    private boolean dealerWon = false;
    private static int playerNumOfWins = 0;
    private static int dealerNumOfWins = 0;
    private int winner = Game.UNSETTLED;

    public Game() {

        Scanner console = new Scanner(System.in);
        deal();
        print();

        while (!player.isBust() && !player.isBlackjack()) {
            String input = console.next();
            if (input.equalsIgnoreCase("h")) {
                hit(player);
                print();
            }
            if (input.equalsIgnoreCase("s")) {
                break;
            }
        }


        dealerAI();

    }

    void dealerAI() {
        dealersTurn = true;
        print();
        wait(2000);
        while (!dealer.isBust() && !player.isBust() && !dealer.isStand()) {

            if (dealer.getPoints() < player.getPoints()) {
                hit(dealer);
                print();
                wait(2000);

            } else {
                dealer.setStand(true);
                dealerWon = true;
            }
        }
        declareWinner();
        print();
    }

    void deal() {
        player.giveCard(deck.takeCard());
        player.giveCard(deck.takeCard());

        dealer.giveCard(deck.takeCard());
        dealer.giveCard(deck.takeCard());
    }

    void hit(Hand hand) {
        hand.giveCard(deck.takeCard());
    }

    void clearConsole() {
        for (int i = 0; i < 300; i++) {
            System.out.println();
        }
    }

    private void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void declareWinner(){

        if (dealer.isBust()) {
            Game.playerNumOfWins++;
            winner = Game.PLAYER;
           }else if (player.isBust() ) {
            Game.dealerNumOfWins++;
            winner = Game.DEALER;
        } else {
            Game.dealerNumOfWins++;
            winner = Game.DEALER;
        }
    }

    void print() {
        clearConsole();

        System.out.println("+========= BLACKJACK ==========+");
        System.out.println();
        System.out.println("         You  -  Dealer         ");
        System.out.println("          " + playerNumOfWins + "        " + dealerNumOfWins);
        if (winner == Game.DEALER) {
            System.out.println("        The dealer wins         ");
        } else if (winner == Game.PLAYER) {
            System.out.println("            You win             ");
        } else {
            System.out.println("                                ");
        }
        System.out.println("+==============================+");
        System.out.println();
        System.out.println("+=========== PLAYER ===========+");
        System.out.print("  " + player);
        if (player.isBlackjack()) {
            System.out.print("  Blackjack");
        } else if (player.isBust()) {
            System.out.print("  BUST!!!");
        }
        System.out.println();



        System.out.println("  points : " + player.getPoints());
        System.out.println("+=========== DEALER ===========+");

        // only show the dealers first card and let the second card face down when it's not his turn.
        if (!dealersTurn) {
            System.out.println("  " + dealer.getFirstCard() + " \u2588");
            System.out.println("  points : ");
            // show all dealers cards when it's his turn
        } else {
            System.out.print("  " + dealer);
            if (dealer.isBlackjack()) {
                System.out.print("  Blackjack");
            } else if (dealer.isBust()) {
                System.out.print("  BUST!!!");
            }
            System.out.println();
            System.out.println("  points : " + dealer.getPoints());
        }





    }
}
