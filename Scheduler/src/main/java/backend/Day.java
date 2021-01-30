package backend;

import java.util.ArrayList;

import enums.DayOfWeek;

public class Day {
	ArrayList<Hour> hours;
	DayOfWeek dayOfWeek;

	public Day() {
		hours = new ArrayList<Hour>();
		for (int i = 0; i < 24 ; i++) {
			Hour hour = new Hour();
			hours.add(hour);
		}
	}
	
	
	public ArrayList<Hour> getHours() {
		return hours;
	}

	public void setHours(ArrayList<Hour> hours) {
		this.hours = hours;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
