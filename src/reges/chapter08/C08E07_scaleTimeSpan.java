package reges.chapter08;

public class C08E07_scaleTimeSpan {


	public static void main(String[] args) {
		MyTimeSpan ts1 = new MyTimeSpan(1,45);

		System.out.println("Timespan 1 = " + ts1);
		ts1.scale(2);
		System.out.println("Timespan 1 scaled by factor 2 = " + ts1);
	}
}
