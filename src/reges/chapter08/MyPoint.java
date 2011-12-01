package reges.chapter08;

import java.awt.Point;

public class MyPoint extends Point{
	
	
	private static final long serialVersionUID = 1L;

	public int manhattanDistance(Point other){
		return Math.abs(this.x - other.x) + Math.abs(this.y - other.y);
		
	}
	
	public boolean isVertical(Point other){
		if (this.x == other.x){
			return true;
		}else{
			return false;
		}
	}
			
	public double slope(Point other) throws IllegalArgumentException {
		if (this.x == other.x){
			throw new IllegalArgumentException("fails because the points have the same x coordinate");
		}
		return (double)Math.round(((this.y - other.y)/(this.x - other.x) * 10000) / 10000); // slope rounded to 4 decimals
	}
	
	public double slope(Point p1, Point p2){
		if (p1.x == p2.x){
			throw new IllegalArgumentException("fails because the points have the same x coordinate");
		}
		return (double)Math.round(((p1.y - p2.y)/(p1.x - p2.x) * 10000) / 10000); // slope rounded to 4 decimals
	}
	
	public boolean isCollinear(Point p1, Point p2){
		if ((p1.x == p2.x) && (this.x == p1.x)){
			return true;
		}
		
		if ( slope(this, p1) == slope(this,p2) ){
			if(slope(p1, p2) == slope(this,p2)){
				return true;
			}
		}
		
		return false;
	}
}
