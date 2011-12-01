package reges.projects;

public class Date {
	private int year, month, day;
	
	public Date(){
		this.year = 2011;
		this.month = 3;
		this.day = 15;
	}

	public Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public void addDays(int days){
		while (days != 0){
			day++;
			days--;
			
			if(day > getNumOfDaysInMonth()){
				day = 1;
				month++;
			}
					
			if (month > 12){
				month = 1;
				year++;
			}
		}
	}
	public void addWeeks(int weeks){
		addDays(weeks*7);
	}
	public int daysTo(Date other){
		int day1 = this.day;
		int day2 = other.getDay();
		int month1 = this.month;
		int month2 = this.getMonth();
		int year1 = this.year;
		int year2 = other.getYear();
		int days = 0;
		
		while (!(year1 == year2 && month1 == month2 && day1 == day2)){
			day1++;
			days++;
			if (day1 > getNumOfDaysInMonth(month1, year1)){
				day1 = 1;
				month1++;
			}
			if (month1 > 12){
				month1 = 1;
				year1++;
			}
		}
		return days;
	}
	public int getDay() {return this.day;}
	public int getMonth() {return this.month;}
	public int getYear(){return this.year;}
	public boolean isLeapYear(){
		if (this.year % 400 == 0){
			return true;
		} else if (this.year % 100 == 0){
			return false;
		}else if (this.year % 4 == 0){
			return true;
		}else {
			return false;
		}
	}
	public boolean isLeapYear(int year){
		if (year % 400 == 0){
			return true;
		} else if (year % 100 == 0){
			return false;
		}else if (year % 4 == 0){
			return true;
		}else {
			return false;
		}
	}
	public String toString(){
		return (this.year + "/" + this.month + "/" + this.day);
	}
	//month is (1-12)
	private int getNumOfDaysInMonth(){
		int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && isLeapYear()){
			return 29;
		}else {
			return DAYS_IN_MONTH[month-1];
		}

	}
	//month is (1-12)
	private int getNumOfDaysInMonth(int month, int year){
		int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (month == 2 && isLeapYear(year)){
			return 29;
		}else {
			return DAYS_IN_MONTH[month-1];
		}

	}
}
