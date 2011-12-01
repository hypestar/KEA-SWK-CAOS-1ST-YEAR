package reges.chapter08;

import java.awt.Point;

public class Rectangle {

	private int x, y, width, height;

	public Rectangle(){
		this(0,0,1,1);
	}

	public Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point p, int width, int height){
		this.x = p.x;
		this.y = p.y;
		this.height = height;
		this.width = width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Rectangle[x=" + x + ",y=" + y + ",width=" + width + ",height=" + height + "]";
	}

	public boolean contains(int x, int y) {
		if ( (x >= this.x && x <= this.x + this.width) && (y >= this.y && y <= this.y + this.height) ){
			return true;
		}
		return false;
	}

	public boolean contains(Point p) {
		if ( (p.x >= this.x && p.x <= this.x + this.width) && (p.y >= this.y && p.y <= this.y + this.height) ){
			return true;
		}
		return false;
	}

	public boolean contains(Rectangle rect){

		//points of the rect's four corners
		Point topLeft = new Point(rect.x, rect.y);
		Point topRight = new Point(topLeft.x + rect.width, topLeft.y);
		Point bottomLeft = new Point(topLeft.x, rect.y + rect.height);
		Point bottomRight = new Point(topRight.x, bottomLeft.y);

		return contains(topLeft) && contains(topRight) && contains(bottomLeft) && contains(bottomRight); 
	}

	//returns a new Rectangle object that represents the area occupied by the thightest bounding box
	//contains both this Rectangle and the given other Rectangle.
	public Rectangle union(Rectangle rect){
		int newX, newY, newWidth, newHeight;

		//if one of the Rectangle completely contains the other Rectangle, then that Rectangle is equal to the union rectangle
		if (contains(rect)){
			return this;
		}else if(rect.contains(this)){
			return rect;
		}

		// determine newX
		if (x <= rect.x){
			newX = x;
		}else {
			newX = rect.x;
		}

		// determine newY
		if (y <= rect.y){
			newY = y;
		}else {
			newY = rect.y;
		}

		//determine newWidth
		if (x + width >= rect.x + rect.width ){
			newWidth = Math.abs(newX - (x + width));
		}else{
			newWidth = Math.abs(newX - (rect.x + rect.width));
		}

		//determine newHeight
		if (y + height >= rect.y + rect.height ){
			newHeight = Math.abs(newY - (y + height));
		}else{
			newHeight = Math.abs(newY - (rect.y + rect.height));
		}

		return new Rectangle(newX, newY, newWidth, newHeight);
	}


	/* Return a new Rectangle that represents the largest rectangular region completely contained
	 * within both this Rectangle and the given other Rectangle. If the Rectangles do not intersect
	 * at all, returns a Rectangle with x=0 y=0 width=0 height=0
	 */
	public Rectangle intersection(Rectangle rect){
		int newX, newY, newWidth, newHeight;
		/* outerRect is the Rectangle which contains the other (innerRect) Rectangle's
		 * x and y points 
		 */
		Rectangle innerRect, outerRect;

		//determine which rectangle is the inner and which is the outer
		if (contains(rect.x, rect.y)){
			outerRect = this;
			innerRect = rect;
		}else if(rect.contains(x, y)){
			outerRect = rect;
			innerRect = this;			
		}else{
			return new Rectangle(0, 0, 0, 0); //the rectangles don't intersect
		}

		//our newX and newY is equal to the innerRect's x and y points
		newX = innerRect.x;
		newY = innerRect.y;

		//determine newWidth
		if (innerRect.x + innerRect.width <= outerRect.x + outerRect.width){ 
			newWidth = Math.abs(newX - (innerRect.x + innerRect.width));
		}else{
			newWidth = Math.abs(newX - (outerRect.x + outerRect.width));
		}

		//determine newHeight
		if (innerRect.y + innerRect.height <= outerRect.y + outerRect.height){
			newHeight = Math.abs(newY - (innerRect.y + innerRect.height));
		}else{
			newHeight = Math.abs(newY - (outerRect.y + outerRect.height));
		}

		return new Rectangle(newX, newY, newWidth, newHeight);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}



}
