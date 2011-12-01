package reges.chapter08;

public class MyTimeSpan extends TimeSpan {

	public MyTimeSpan(int hours, int minutes){
		super(hours, minutes);
	}

	public void add(TimeSpan span){
		this.setTotalMinutes(this.getTotalMinutes() + span.getTotalMinutes());
	}

	public void subtract(TimeSpan span){
		this.setTotalMinutes(this.getTotalMinutes() - span.getTotalMinutes());
	}

	public void scale(int factor) {
		this.setTotalMinutes(this.getTotalMinutes() * factor);		
	}

}
