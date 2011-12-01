package reges.chapter08;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

class RectangleDrawingPanel extends JPanel{
	 
	private Rectangle rect1 = new Rectangle(150, 50, 200, 200);
	private Rectangle rect2 = new Rectangle(200, 100, 200, 200);
	private Rectangle union = rect1.union(rect2);
	private Rectangle intersection = rect1.intersection(rect2);
	private boolean showIntersect = false;
	private boolean showUnion = false;
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.GREEN);
		g.drawRect(rect1.getX(), rect1.getY(), rect1.getWidth(), rect1.getHeight());
		
		g.setColor(Color.BLUE);
		g.drawRect(rect2.getX(), rect2.getY(), rect2.getWidth(), rect2.getHeight());
		
		if (showUnion){
		g.setColor(Color.RED);
		g.drawRect(union.getX(), union.getY(), union.getWidth(), union.getHeight());
		}
		
		if (showIntersect){
		g.setColor(Color.MAGENTA);
		g.fillRect(intersection.getX(), intersection.getY(), intersection.getWidth(), intersection.getHeight());
		}
	}
	
	@Override
	public void repaint() {
			super.repaint();
	}
	
	public boolean isShowIntersect() {
		return showIntersect;
	}

	public void setShowIntersect(boolean showIntersect) {
		this.showIntersect = showIntersect;
	}

	public boolean isShowUnion() {
		return showUnion;
	}

	public void setShowUnion(boolean showUnion) {
		this.showUnion = showUnion;
	}
	
	public void toggleIntersection(){
		updateIntersection();
		if (showIntersect){
			showIntersect = false;
		}else{
			showIntersect = true;
		}
		repaint();
	}
	
	public void toggleUnion(){
		updateUnion();
		if (showUnion){
			showUnion = false;
		}else{
			showUnion = true;
		}
		repaint();
	}
	
	private void updateUnion() {
		union = rect1.union(rect2);
		repaint();
	}

	private void updateIntersection(){
		intersection = rect1.intersection(rect2);
		repaint();
	}
	
	public void updateRect1(int x, int y, int width, int height) {
		rect1 = new Rectangle(x, y, width, height);
		updateAll();
		repaint();
	}
	
	public void updateRect2(int x, int y, int width, int height) {
		rect2 = new Rectangle(x, y, width, height);
		updateAll();
		repaint();
	}
	
	private void updateAll(){
		updateIntersection();
		updateUnion();
	}
}

