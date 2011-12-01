package caos.threads.skyggebolde;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;


public class Pitch extends JFrame {
	private int rightScore = 0;
	private int leftScore = 0;
	private ArrayList<Ball> balls = new ArrayList<Ball>();
	private ArrayList<Thread> threads = new ArrayList<Thread>();

	private JLayeredPane pane;
	private JLabel score;
	private JLabel scoreShadow;
	
	public static void main(String[] args) {
		Pitch pitch = new Pitch();
		pitch.kickOff(4);		
	}

	public Pitch() {
		JLabel field = new JLabel();
		field.setSize(600, 400);
		field.setIcon(new ImageIcon("resource/field.jpg"));
			
		setSize(600,425);
		setBackground(Color.WHITE);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pane = new JLayeredPane();
		pane.setSize(600, 400);
		pane.add(field,10);

		score = new JLabel("0 - 0");
		score.setFont(new Font("Dialog", Font.PLAIN, 30));
		score.setForeground(Color.RED);
		score.setSize(150,30);
		score.setLocation(265, 10);
				
		scoreShadow = new JLabel("0 - 0");
		scoreShadow.setFont(new Font("Dialog", Font.PLAIN, 30));
		scoreShadow.setForeground(Color.WHITE);
		scoreShadow.setSize(150,30);
		scoreShadow.setLocation(score.getLocation().x+2, score.getLocation().y + 1);
		
		pane.add(scoreShadow,0);
		pane.add(score,0);
		add(pane);
	}

	public void rightScore(){
		rightScore++;
		score.setText(leftScore + " - " + rightScore);
		scoreShadow.setText(leftScore + " - " + rightScore);
	}

	public void leftScore(){
		leftScore++;
		score.setText(leftScore + " - " + rightScore);
		scoreShadow.setText(leftScore + " - " + rightScore);
	}

	public void kickOff(int numBalls){
		balls.clear();
		threads.clear();
		Random randGen = new Random();

		for (int ball = 0; ball < numBalls; ball++){
			balls.add(new Ball(this, pane, randGen.nextInt(300) + 30, randGen.nextInt(100) + 30));
			threads.add(new Thread(balls.get(ball)));
		}

		for (Thread t : threads){
			t.start();
		}
	}
}
