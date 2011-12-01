package reges.projects;

public class RationalNumber {

	private int numerator, denominator;


	public RationalNumber() {
		this(0,1);
	}

	public RationalNumber(int numerator, int denominator) {
		if(denominator == 0){
			throw new IllegalArgumentException("The denominator is not allowed to be 0");
		}

		this.numerator = numerator;
		this.denominator = denominator;
		formatFraction();
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public String toString() {
		if(Math.abs(denominator) > Math.abs(numerator)){
		return numerator + "/"  + denominator;
		}else{
			if (numerator%denominator == 0){
				return "" + (numerator/denominator);
			}else{
				return (numerator/denominator) + " " + Math.abs(numerator % denominator) + "/" + Math.abs(denominator);
			}
		}
	}

	//returns the Greatest Common Divisor this fraction
	public int findGCD(){
		int highestPossibleDivisor;
		int GCD = 1;

		if (Math.abs(denominator) > Math.abs(numerator)){
			highestPossibleDivisor = Math.abs(numerator);
		}else{
			highestPossibleDivisor = Math.abs(denominator);
		}

		for(int divisor = 1; divisor <= highestPossibleDivisor;divisor++){
			if(numerator % divisor == 0 && denominator % divisor == 0){
				GCD = divisor;
			}
		}
		return GCD;		
	}

	//reduce this fraction to its  simplest form
	public void reduceFraction() {
		int GCD = findGCD();
		denominator = denominator / GCD;
		numerator = numerator / GCD;
	}

	//If the denominator is negative and the numerator is positive. 
	//then the minus sign is moved to numeraor  
	private void moveMinusSign(){
		if (denominator < 0 && numerator > 0){
			denominator = Math.abs(denominator);
			numerator = numerator * -1;
		}
	}

	private void formatFraction() {
		reduceFraction();
		moveMinusSign();
	}

	public RationalNumber multiply(RationalNumber rn) {
		int newNumerator = numerator * rn.getNumerator();
		int newDenominator = denominator * rn.getDenominator();
		RationalNumber result = new RationalNumber(newNumerator, newDenominator);
		return result;
	}

	public RationalNumber dividedBy(RationalNumber rn){
		int newNumerator = numerator * rn.getDenominator();
		int newDenominator = denominator * rn.getNumerator();
		RationalNumber result = new RationalNumber(newNumerator, newDenominator);
		return result;
	}
	
	public RationalNumber add(RationalNumber rn){
		int newDenominator = denominator * rn.denominator;
		int newNumerator = (numerator * (newDenominator/denominator)) + (rn.numerator * (newDenominator/rn.denominator)); 
		RationalNumber result = new RationalNumber(newNumerator, newDenominator);
		return result;
	}

	public RationalNumber subtractBy(RationalNumber rn){
		int newDenominator = denominator * rn.denominator;
		int newNumerator = (numerator * (newDenominator/denominator)) - (rn.numerator * (newDenominator/rn.denominator)); 
		RationalNumber result = new RationalNumber(newNumerator, newDenominator);
		return result;
	}
}
