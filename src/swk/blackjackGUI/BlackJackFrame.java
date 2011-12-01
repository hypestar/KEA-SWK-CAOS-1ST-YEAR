package swk.blackjackGUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BlackJackFrame extends JFrame {

	private JPanel contentPane;
	private Blackjack controller = new Blackjack(this);
	
	JLabel playerScoreLabel;
	JLabel dealerScoreLabel;
	
	ArrayList<JLabel> dealerHand = new ArrayList<JLabel>();
	ArrayList<JLabel> playerHand = new ArrayList<JLabel>();
	JLabel lblWinner;
	JButton btnStand;
	JButton btnHit;
	JButton btnDeal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlackJackFrame frame = new BlackJackFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BlackJackFrame() {
		setTitle("Blackjack");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 415);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(34, 139, 34));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel pCard1 = new JLabel("");
		pCard1.setBounds(64, 231, 72, 96);
		contentPane.add(pCard1);
		
		JLabel pCard2 = new JLabel("");
		pCard2.setBounds(148, 231, 72, 96);
		contentPane.add(pCard2);
		
		JLabel pCard3 = new JLabel("");
		pCard3.setBounds(232, 231, 72, 96);
		contentPane.add(pCard3);
		
		JLabel pCard4 = new JLabel("");
		pCard4.setBounds(316, 231, 72, 96);
		contentPane.add(pCard4);
		
		JLabel pCard5 = new JLabel("");
		pCard5.setBounds(400, 231, 72, 96);
		contentPane.add(pCard5);
		
		JLabel dCard1 = new JLabel("");
		dCard1.setBounds(64, 49, 72, 96);
		contentPane.add(dCard1);
		
		JLabel dCard2 = new JLabel("");
		dCard2.setBounds(148, 49, 72, 96);
		contentPane.add(dCard2);
		
		JLabel dCard3 = new JLabel("");
		dCard3.setBounds(232, 49, 72, 96);
		contentPane.add(dCard3);
		
		JLabel dCard4 = new JLabel("");
		dCard4.setBounds(316, 49, 72, 96);
		contentPane.add(dCard4);
		
		JLabel dCard5 = new JLabel("");
		dCard5.setBounds(400, 49, 72, 96);
		contentPane.add(dCard5);
		
		playerHand.add(pCard1);
		playerHand.add(pCard2);
		playerHand.add(pCard3);
		playerHand.add(pCard4);
		playerHand.add(pCard5);
		
		dealerHand.add(dCard1);
		dealerHand.add(dCard2);
		dealerHand.add(dCard3);
		dealerHand.add(dCard4);
		dealerHand.add(dCard5);
	
		
		
		btnStand = new JButton("Stand");
		btnStand.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				controller.dealerAI();
			}
		});
		btnStand.setBounds(355, 354, 117, 25);
		contentPane.add(btnStand);
		
		btnHit = new JButton("Hit");
		btnHit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				controller.hit(false);
			}
		});
		btnHit.setBounds(226, 354, 117, 25);
		contentPane.add(btnHit);
		
		lblWinner = new JLabel("");
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setForeground(new Color(255, 0, 0));
		lblWinner.setFont(new Font("Arial", lblWinner.getFont().getStyle(), 50));
		lblWinner.setBounds(74, 164, 398, 49);
		contentPane.add(lblWinner);
		
		dealerScoreLabel = new JLabel("");
		dealerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dealerScoreLabel.setFont(new Font("Arial", dealerScoreLabel.getFont().getStyle(), 40));
		dealerScoreLabel.setBounds(484, 49, 117, 96);
		contentPane.add(dealerScoreLabel);
		
		playerScoreLabel = new JLabel("");
		playerScoreLabel.setFont(new Font("Arial", playerScoreLabel.getFont().getStyle(), 40));
		playerScoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
		playerScoreLabel.setBounds(484, 231, 117, 96);
		contentPane.add(playerScoreLabel);
		
		btnDeal = new JButton("Deal");
		btnDeal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
			controller.deal();
			}
		});
		btnDeal.setBounds(86, 354, 117, 25);
		contentPane.add(btnDeal);
	
	
		controller.deal();
	}
	
	
}
