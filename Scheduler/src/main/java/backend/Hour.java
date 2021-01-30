package backend;

import java.util.ArrayList;

public class Hour {
	ArrayList<Integer> Minutes;

	public Hour(ArrayList<Integer> minutes) {
		super();
		Minutes = minutes;
	}

	public ArrayList<Integer> getMinutes() {
		return Minutes;
	}

	public void setMinutes(ArrayList<Integer> minutes) {
		Minutes = minutes;
	}

}
