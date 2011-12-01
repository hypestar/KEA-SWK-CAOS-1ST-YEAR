/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swk.blackjack;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hypestar
 */
public class BlackJack {

    public static void main(String[] args) {
        while (true) {
            new Game();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BlackJack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
