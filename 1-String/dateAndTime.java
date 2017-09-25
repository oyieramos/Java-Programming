~~~~~~~~~~~~~~~~~~~~~~~~~~ Date and Time
import java.text.DateFormatSymbols;
import java.util.Calendar;

public class Solution {
    public static String getDay(String day, String month, String year) {
    	int yearInt = Integer.parseInt(year);
      	int monthInt = Integer.parseInt(month);
      	int dayInt = Integer.parseInt(day);
      
      	Calendar calendar = Calendar.getInstance();
		calendar.set(yearInt, monthInt - 1, dayInt);

		String answer = new DateFormatSymbols()
		  	.getWeekdays()[calendar.get(Calendar.DAY_OF_WEEK)].toUpperCase();
      	return answer;
    }