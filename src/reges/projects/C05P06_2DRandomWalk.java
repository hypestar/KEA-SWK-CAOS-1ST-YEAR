package reges.projects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C05P06_2DRandomWalk {
	private JFrame frame;
	private JPanel rwp;
	private JPanel controlPanel;
	private JButton walkButton;
	private JLabel movesLabel;

	public C05P06_2DRandomWalk() {
		frame = new JFrame("2D Random Walk");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);
		frame.setTitle("Rectangle");
		frame.setLayout(new BorderLayout());
		rwp = new RandomWalkPanel();
		controlPanel = new ControlPanel();
		frame.add(rwp, BorderLayout.CENTER);
		frame.add(controlPanel,BorderLayout.SOUTH);
		frame.setVisible(true);
		rwp.repaint();

	}

	public static void main(String[] args) {
		new C05P06_2DRandomWalk();

	}

	public class ControlPanel extends JPanel {


		public ControlPanel() {
			setBackground(Color.ORANGE);
			setLayout(new FlowLayout());
			movesLabel = new JLabel("Moves");
			walkButton = new JButton("Walk");
			walkButton.addActionListener(new MyListener());
			add(movesLabel);
			add(walkButton);

		}
	}

	public class RandomWalkPanel extends JPanel {
		private static final long serialVersionUID = 1L;
		Random rand = new Random();
		int xDirection, yDirection;
		ArrayList<Shape> rects = new ArrayList<Shape>();
		public static final int SIZE = 390; 

		private Point2D walkPosition = new Point2D.Double(SIZE/2, SIZE/2);

		public RandomWalkPanel() {
			setBackground(Color.WHITE);
			setPreferredSize(new Dimension(SIZE/2, SIZE/2));
		}

		private void walk() {
			int moves = 0;
			walkPosition.setLocation(SIZE/2, SIZE/2);
			rects.clear();
			//initial position
			rects.add(new Rectangle((int)walkPosition.getX(), (int)walkPosition.getY(), 1, 1));

			while (walkPosition.distance(SIZE/2, SIZE/2) < SIZE/2){
				moves++;
				movesLabel.setText("" + moves);
				if (rand.nextInt(2)  == 0) {
					xDirection = -1;
				}else{
					xDirection = 1;
				}

				if (rand.nextInt(2)  == 0) {
					yDirection = -1;
				}else{
					yDirection = 1;
				}
				walkPosition.setLocation(walkPosition.getX() + xDirection, walkPosition.getY() + yDirection);
				rects.add(new Rectangle((int)walkPosition.getX(), (int)walkPosition.getY(), 1, 1));
			}
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			g.setColor(Color.BLACK);
			g.drawOval(0, 0, SIZE, SIZE);
			g.drawRect((int)walkPosition.getX(),(int)walkPosition.getY(), 1, 1);

			for(Shape rect : rects){
				g2.draw(rect);
			}
			repaint();
		}
	}

	public class MyListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == walkButton){
			((RandomWalkPanel) rwp).walk();
			}
		}

	}

}
