import java.util.HashMap;
import java.util.Map;

/**
 * You are given the following information, but you may prefer to do some research for yourself.
 *
 *	1 Jan 1900 was a Monday.
 *	Thirty days has September,
 *	April, June and November.
 *	All the rest have thirty-one,
 *	Saving February alone,
 *	Which has twenty-eight, rain or shine.
 *	And on leap years, twenty-nine.
 *	A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 *	How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author ag877r
 *
 */
public class Euler19 {

	private Map monthMap = new HashMap(); 
	
	public static void main(String[] args){
		
	}
	
	/*
	 * Create a map that maps out how many days are in each month.
	 */
	private Map createMonthMap(){
		monthMap.put(1, 31);
		monthMap.put(2, 28);
		monthMap.put(3, 31);
		monthMap.put(4, 30);
		monthMap.put(5, 31);
		monthMap.put(6, 30);
		monthMap.put(7, 31);
		monthMap.put(8, 31);
		monthMap.put(9, 30);
		monthMap.put(10, 31);
		monthMap.put(11, 30);
		monthMap.put(12, 31);
		
		return monthMap;
	}
	
	/**
	 * This method will loop through the days of the months.
	 * It will count when a sunday lands on the first day of the month.
	 */
	private int countSundays(){
		Map map = createMonthMap();
		
		for(int i )
	}
}
