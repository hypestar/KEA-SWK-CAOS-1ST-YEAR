package caos.threads.skyggebolde;

import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Ball implements Runnable {
	private Pitch pitch;
	private JLayeredPane pane;
	private double xSpeed = 0;
	private double ySpeed = 0;
	private int diameter = 0;
	private int rightSide = 600;
	private int leftSide = 0;
	private int top = 0;
	private int bottom = 400;
	private int x;
	private int y;
	private int ballSleep = 10;
	private JLabel ball = new JLabel("");
	
	public Ball(Pitch game, JLayeredPane pane, int x, int y) {
		ball.setSize(30, 30);
		ImageIcon ballImage = new ImageIcon("resource/ball3030.png");
		ball.setIcon(ballImage);
		
		this.pitch = game;
		this.pane = pane;
		this.x = x;
		this.y = y;
		
		Random randGen = new Random();
		if(randGen.nextBoolean()){		
			xSpeed = 1;
		}else{
			xSpeed = -1;
		}
		
		if(randGen.nextBoolean()){		
			ySpeed = 1;
		}else{
			ySpeed = -1;
		}
		diameter = 30;
		pane.add(ball, 0);
	}
	
	@Override
	public void run() {
		while (true){
			detectGoal();
			moveBall();
			try {
				Thread.sleep(ballSleep);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private synchronized void moveBall(){
		
		if(y + diameter >= bottom){
			increaseVerticalBallSpeed();
			ySpeed = -ySpeed;
		}else if(y <= top){
			increaseVerticalBallSpeed();
			ySpeed = Math.abs(ySpeed);
		}else if(x + diameter >= rightSide){
			increaseHorizontalBallSpeed();
			xSpeed = -xSpeed;
		}else if(x <= leftSide){
			increaseHorizontalBallSpeed();
			xSpeed = Math.abs(xSpeed);
		}
		
		x += xSpeed;
		y += ySpeed;
		
		ball.setLocation(x,y);
	}
	
	private void increaseVerticalBallSpeed(){
		ySpeed += 1;
	}
	
	private void increaseHorizontalBallSpeed(){
		xSpeed += 1;
		
}
	
	private void detectGoal(){
		
		Rectangle ballRect = new Rectangle(ball.getLocation().x, ball.getLocation().y, diameter, diameter);
				
		// Rightside goal detection
		if (ballRect.intersectsLine(585, 190, 585, 200) && xSpeed > 0){
			pitch.rightScore();
			stopBall();
		}
		// Leftside goal detection
		if (ballRect.intersectsLine(14, 190, 14, 200) && xSpeed < 0){
			pitch.leftScore();		
			stopBall();
		}
	}
	
	public void stopBall(){
		xSpeed = 0;
		ySpeed = 0;
	}
	
	public void removeBallFromField(){
		pane.remove(ball);
	}
}
