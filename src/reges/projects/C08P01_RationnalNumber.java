package reges.projects;

public class C08P01_RationnalNumber {

	public static void main(String[] args) {
		RationalNumber rn1 = new RationalNumber(13, -4);
		RationalNumber rn2 = new RationalNumber(1, 2); 
		System.out.println("fraction 1 " + rn1);
		System.out.println("fraction 2 " + rn2);
		System.out.println(rn1 + " * " + rn2 + " = " + rn1.multiply(rn2));
		System.out.println(rn1 + " : " + rn2 + " = " + rn1.dividedBy(rn2));
		System.out.println(rn2 + " : " + rn1 + " = " + rn2.dividedBy(rn1));
		System.out.println(rn1 + " + " + rn2 + " = " + rn1.add(rn2));
		System.out.println(rn1 + " - " + rn2 + " = " + rn1.subtractBy(rn2));
	}

}
