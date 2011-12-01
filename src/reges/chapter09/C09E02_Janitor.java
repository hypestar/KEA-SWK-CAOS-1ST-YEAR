package reges.chapter09;

public class C09E02_Janitor extends Employee {

	@Override
	public int getHours() {
		
		return super.getHours() * 2;
	}

	@Override
	public double getSalary() {
		return super.getSalary() - 10000;
	}

	@Override
	public int getVacationDays() {
		return super.getVacationDays() / 2;
	}
	
	public void clean() {
		System.out.print("Workin' for the man");
	}

}
