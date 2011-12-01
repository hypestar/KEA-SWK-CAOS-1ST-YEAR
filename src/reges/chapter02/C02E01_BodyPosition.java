package reges.chapter02;

public class C02E01_BodyPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calcPosition(10.1, 23.2, 32.4, 12.6));
		
	}
	
	public static double calcPosition(double _s0, double _v0, double _a, double _t){
		double s0, v0, a, t, s;
		s0 = _s0;
		v0 = _v0;
		a = _a;
		t = _t;
		
		s = s0 + v0 * t + .5 * a * java.lang.Math.pow(t, 2);
		return s;
	}

}
