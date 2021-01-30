package backend;

import enums.ClassType;

public class Minute {
	ClassType classType;

	public Minute(ClassType classType) {
		super();
		this.classType = classType;
	}

	public ClassType getClassType() {
		return classType;
	}

	public void setClassType(ClassType classType) {
		this.classType = classType;
	}

}
