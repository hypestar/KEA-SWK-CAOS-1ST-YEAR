package reges.chapter08;

public class C08E06_subtractTimeSpan {


	public static void main(String[] args) {
		MyTimeSpan ts1 = new MyTimeSpan(5,23);
		MyTimeSpan ts2 = new MyTimeSpan(1,22);

		System.out.println("Timespan 1 = " + ts1);
		System.out.println("Timespan 2 = " + ts2);
		ts1.subtract(ts2);
		System.out.print("Timespan 1 - Timespan 2 = " + ts1);
	}
}
