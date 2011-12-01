package reges.projects;

import reges.projects.Date;
public class C08P02_Date {

	public static void main(String[] args) {
		Date date1 = new Date(2011, 3, 15);
		Date date2 = new Date(2011, 4, 1);
		
		//System.out.println(date1.toString());
		//date1.addDays(8000);
		//date1.addWeeks(100);
		
		System.out.print("There is " + date1.daysTo(date2) + " days between " + date1.toString() + " and " + date2.toString());
		//System.out.println(date1.toString());
		
	}

	
	
	}


