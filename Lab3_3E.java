/**
 * @(#)Lab3_3E.java
 *
 *
 * @author 
 * @version 1.00 2014/2/6
 */


public class Lab3_3E {
	public static void main(String[] args){
		
		int month, day, year;   //date read in from user
        int daysInMonth;        //number of days in month read in
		boolean monthValid, yearValid, dayValid, leapYear, dateValid;  //true if input from user is valid
		
		String builder = "";
		
		String[] months = new String[]{"January", "February", "March", "Arpil", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		day = GetInfo.getInt("Enter the day in DD form");
		month = GetInfo.getInt("Enter the month in MM form");
		year = GetInfo.getInt("Enter the year in YYYY form");
		
		if((year % 400 == 0) || ((year % 4 == 0) && !(year % 100 == 0)))
			leapYear = true;
		else leapYear = false;
		
		if(leapYear)
			monthDays[1] = 29;
		
		if(month > 0 && month < 13)
			monthValid = true;
		else monthValid = false;
		
		if(day > 0 && monthValid && day <= monthDays[month-1])
			dayValid = true;
		else dayValid = false;
		
		if(year > 999 && year < 2000)
			yearValid = true;
		else yearValid = false;
		
		if(yearValid && dayValid && monthValid)
			dateValid = true;
		else dateValid = false;
		
		if(dateValid)
			builder+="MSG01 - Date is valid\n";
		
		if(leapYear && dateValid)
			builder+="MSG02  Date is a Leap Year\n";
			
		if(!dateValid){
			if(!dayValid)
				builder+="ERR02 - Day is not valid\n";
			
			if(!monthValid)
				builder+="ERR01 - Month is not valid\n";
			
			if(!yearValid)
				builder+="ERR03 - Year is not valid\n";
		}
			
		GetInfo.showMessage(builder);
		builder="";
		
    }  
}