package reges.chapter09;

public class C09E01_Marketer extends Employee{

	@Override
	public double getSalary() {
		return 10000 + super.getSalary();
	}

	public void advertise(){
		System.out.print("Act now, while supplies last!");
	}
	
}
