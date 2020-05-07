package com.uca.Lab04NCapas.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
	
	
	@AssertTrue(message="ups no puedes agregar tu producto porque eres un Robot favor hacer click en regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
	
}
