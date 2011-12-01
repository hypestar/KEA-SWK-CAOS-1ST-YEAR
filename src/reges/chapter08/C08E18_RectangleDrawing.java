package reges.chapter08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

 class C08E18_RectangleDrawing implements ActionListener, KeyListener{
	
	 JButton intersectButton, unionButton, updateRect1Button;
	 JTextField x1Field, y1Field, width1Field, height1Field, x2Field, y2Field, width2Field, height2Field ;
	// JCheckBox intersectionCheckBox, unionCheckBox;
	 
	 RectangleDrawingPanel rdp;
	 public C08E18_RectangleDrawing(){
		 	
		 	rdp = new RectangleDrawingPanel();
			
		 	//Main frame :-)
		 	JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600, 500);
			frame.setTitle("Rectangle");
			frame.setLayout(new BorderLayout());
			
			//DrawingPanel
			rdp.setBackground(Color.WHITE);
			rdp.setPreferredSize(new Dimension(600, 370));
			
			frame.add(rdp,BorderLayout.NORTH);
			
			
			
			// Rectangle 1 Labels
			JLabel rect1Label = new JLabel("Rectangle");
			rect1Label.setForeground(Color.GREEN);
			JLabel x1Label = new JLabel("X");
			JLabel y1Label = new JLabel("Y");
			JLabel width1Label = new JLabel("Width");
			JLabel height1Label = new JLabel("Height");
			
			// Rectangle 2 Labels
			JLabel rect2Label = new JLabel("Rectangle");
			rect2Label.setForeground(Color.BLUE);
			JLabel x2Label = new JLabel("X");
			JLabel y2Label = new JLabel("Y");
			JLabel width2Label = new JLabel("Width");
			JLabel height2Label = new JLabel("Height");
			
			//Rectangle 1 input fields
			x1Field = new JTextField();
			x1Field.setPreferredSize(new Dimension(50,25));
			x1Field.setText("150");
			x1Field.setHorizontalAlignment(JTextField.CENTER);
			x1Field.addKeyListener(this);
			y1Field = new JTextField();
			y1Field.setPreferredSize(new Dimension(50,25));
			y1Field.setText("50");
			y1Field.setHorizontalAlignment(JTextField.CENTER);
			y1Field.addKeyListener(this);
			width1Field = new JTextField();
			width1Field.setPreferredSize(new Dimension(50,25));
			width1Field.setText("200");
			width1Field.setHorizontalAlignment(JTextField.CENTER);
			width1Field.addKeyListener(this);
			height1Field =  new JTextField();
			height1Field.setPreferredSize(new Dimension(50,25));
			height1Field.setText("200");
			height1Field.setHorizontalAlignment(JTextField.CENTER);
			height1Field.addKeyListener(this);
			
			//Rectangle 2 input fields
			x2Field = new JTextField();
			x2Field.setPreferredSize(new Dimension(50,25));
			x2Field.setText("200");
			x2Field.setHorizontalAlignment(JTextField.CENTER);
			x2Field.addKeyListener(this);
			y2Field = new JTextField();
			y2Field.setPreferredSize(new Dimension(50,25));
			y2Field.setText("100");
			y2Field.setHorizontalAlignment(JTextField.CENTER);
			y2Field.addKeyListener(this);
			width2Field = new JTextField();
			width2Field.setPreferredSize(new Dimension(50,25));
			width2Field.setText("200");
			width2Field.setHorizontalAlignment(JTextField.CENTER);
			width2Field.addKeyListener(this);
			height2Field =  new JTextField();
			height2Field.setPreferredSize(new Dimension(50,25));
			height2Field.setText("200");
			height2Field.setHorizontalAlignment(JTextField.CENTER);
			height2Field.addKeyListener(this);
						
			//Buttons
			intersectButton = new JButton("Intersection");
			intersectButton.addActionListener(this);
			intersectButton.setPreferredSize(new Dimension(150, 25));
			
			unionButton = new JButton("union");
			unionButton.addActionListener(this);
			unionButton.setPreferredSize(new Dimension(150, 25));
			
			updateRect1Button = new JButton("Update Rectangle");
			updateRect1Button.addActionListener(this);
			updateRect1Button.setPreferredSize(new Dimension(150, 25));
			
			JPanel controlPanel  = new JPanel(new GridLayout(3, 1));
			//controlPanel.setPreferredSize(new Dimension(600, 200));
						
			JPanel rect1Input = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JPanel rect2Input = new JPanel(new FlowLayout(FlowLayout.CENTER));
			JPanel myButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
			
			
			//Rectangle 1 Input
			rect1Input.add(rect1Label);
			rect1Input.add(x1Label);
			rect1Input.add(x1Field);
			rect1Input.add(y1Label);
			rect1Input.add(y1Field);
			rect1Input.add(width1Label);
			rect1Input.add(width1Field);
			rect1Input.add(height1Label);
			rect1Input.add(height1Field);
			
			//Rectangle 2 Input
			rect2Input.add(rect2Label);
			rect2Input.add(x2Label);
			rect2Input.add(x2Field);
			rect2Input.add(y2Label);
			rect2Input.add(y2Field);
			rect2Input.add(width2Label);
			rect2Input.add(width2Field);
			rect2Input.add(height2Label);
			rect2Input.add(height2Field);
						
			//myButtons 
			myButtons.add(intersectButton);
			myButtons.add(unionButton);
			myButtons.add(updateRect1Button);
						
			controlPanel.add(rect1Input);
			controlPanel.add(rect2Input);
			controlPanel.add(myButtons);
			
			
			frame.add(controlPanel,BorderLayout.SOUTH);
			frame.setVisible(true);
	 }
	 
	public static void main(String[] args) {
				new C08E18_RectangleDrawing();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// intersectButton
		if(e.getSource() == intersectButton){
			rdp.toggleIntersection();
		// unionButton	
		}else if (e.getSource() == unionButton){
			rdp.toggleUnion();
		}else if (e.getSource() == updateRect1Button){
			rdp.updateRect1(Integer.parseInt(x1Field.getText()), Integer.parseInt(y1Field.getText()), Integer.parseInt(width1Field.getText()), Integer.parseInt(height1Field.getText()));
			rdp.updateRect2(Integer.parseInt(x2Field.getText()), Integer.parseInt(y2Field.getText()), Integer.parseInt(width2Field.getText()), Integer.parseInt(height2Field.getText()));
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		rdp.updateRect1(Integer.parseInt(x1Field.getText()), Integer.parseInt(y1Field.getText()), Integer.parseInt(width1Field.getText()), Integer.parseInt(height1Field.getText()));
		rdp.updateRect2(Integer.parseInt(x2Field.getText()), Integer.parseInt(y2Field.getText()), Integer.parseInt(width2Field.getText()), Integer.parseInt(height2Field.getText()));
	}


	
	}


