package reges.projects;

public class C03P03_TwelveDaysOfXmas {
	
	public static void main(String[] args) {
		int totalPresents = 0;
		
		System.out.println("Day\t\tPresents Received\t\tTotal Presents");
		for (int day = 1; day <= 12; day++){
			totalPresents += day;
			System.out.println(day + "\t\t" + day + "\t\t\t\t" + totalPresents);
			
		}
		
		
	}
	
	

}
