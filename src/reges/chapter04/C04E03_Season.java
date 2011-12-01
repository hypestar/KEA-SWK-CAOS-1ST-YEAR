package reges.chapter04;

import java.util.*;

public class C04E03_Season {

	public static void main(String[] args) {
		int day, month;
		Scanner console = new Scanner(System.in);

		System.out.print("Enter day of the month (1-31) : ");
		day = console.nextInt();
		System.out.print("Enter month (1-12) : ");
		month = console.nextInt();
		System.out.print("Season = " + season(day, month));
	}

	public static String season(int day, int month){
		String season = new String();
		
		if(month == 12 && day >= 16){
			season = "winter";
		}else if(month < 3){
			season = "winter";
		}else if (month == 3 && day <= 15){
			season = "winter";
		}else if (month == 3 && day > 15){
			season = "spring";
		}else if (month > 3 && month < 6){
			season = "spring";
		}else if (month == 6 && day <= 15){
			season = "spring";
		}else if (month == 6 && day > 15){
			season = "summer";
		}else if (month > 6 && month < 9){
			season = "summer";
		}else if (month == 9 && day <= 15){
			season = "summer";
		}else if (month == 9 && day > 15){
			season = "fall";
		}else if (month > 9 && month < 12){
			season = "fall";
		}else if (month == 12 && day <= 15){
			season = "fall";
		}
		
		return season;
	}
}
