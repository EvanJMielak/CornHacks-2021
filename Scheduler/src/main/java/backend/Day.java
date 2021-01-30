package backend;

import java.util.ArrayList;

import enums.DayOfWeek;

public class Day {
	ArrayList<Integer> Hours;
	DayOfWeek dayOfWeek;

	public Day(ArrayList<Integer> hours, DayOfWeek dayOfWeek) {
		super();
		Hours = hours;
		this.dayOfWeek = dayOfWeek;
	}

	public ArrayList<Integer> getHours() {
		return Hours;
	}

	public void setHours(ArrayList<Integer> hours) {
		Hours = hours;
	}

	public DayOfWeek getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(DayOfWeek dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
