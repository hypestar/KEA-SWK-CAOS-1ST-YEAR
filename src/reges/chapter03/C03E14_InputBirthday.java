package reges.chapter03;

import java.util.*;

public class C03E14_InputBirthday {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		inputBirthday(console);
	}

	public static void inputBirthday(Scanner console){
		String month, day, year;
		System.out.print("On what day of the month were you born? ");
		day = console.nextLine();
		System.out.print("What is the name of the month in which you were born? ");
		month = console.nextLine();	
		System.out.print("During what year were you born? ");
		year = console.nextLine();
		System.out.println("You were born on " + month + " " + day + ", " + year + ".");
	}
}
