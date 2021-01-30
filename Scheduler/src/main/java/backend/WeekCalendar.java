package backend;

import java.util.ArrayList;
import java.util.List;

public class WeekCalendar {
	
	List<Day> calendar;
	
	public WeekCalendar() {
		calendar = new ArrayList<Day>();
	}
	
	public void initiateListOfDays() {
		for (int i = 0; i < 7 ; i++) {
			Day day = new Day();
			calendar.add(day);
		}
	}
	
	public Day getDay(int day) {
		return calendar.get(day-1);
	}

}
