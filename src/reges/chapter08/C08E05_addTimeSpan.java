package reges.chapter08;

public class C08E05_addTimeSpan {


	public static void main(String[] args) {
		MyTimeSpan ts1 = new MyTimeSpan(1,0);
		MyTimeSpan ts2 = new MyTimeSpan(2,30);

		System.out.println("Timespan 1 = " + ts1);
		System.out.println("Timespan 2 = " + ts2);
		ts1.add(ts2);
		System.out.print("Timespan 1 + Timespan 2 = " + ts1);
	}
}
