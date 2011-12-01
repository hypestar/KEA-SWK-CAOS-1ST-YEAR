package reges.projects;

import java.util.*;
import java.text.*;
public class C03P04_TriangleCosineRelations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int a, b, c;
		
		System.out.print("Enter the length of side a : ");
		a = console.nextInt();
		System.out.print("Enter the length of side b : ");
		b = console.nextInt();
		System.out.print("Enter the length of side c : ");
		c = console.nextInt();
		System.out.println();
		
		System.out.println("Angle A = " + df.format((Math.acos( ((Math.pow(b,2) + Math.pow(c,2) - Math.pow(a,2)) / (2 * b * c)) ))  * 180/Math.PI));
		System.out.println("Angle B = " + df.format((Math.acos( ((Math.pow(a,2) + Math.pow(c,2) - Math.pow(b,2)) / (2 * a * c)) ))  * 180/Math.PI));
		System.out.println("Angle C = " + df.format((Math.acos( ((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,2)) / (2 * a * b)) ))  * 180/Math.PI));
	}
	
	

}
