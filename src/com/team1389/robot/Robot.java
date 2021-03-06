package com.team1389.robot;

import com.team1389.base.RobotCode;
import com.team1389.base.TeleopBase;
import com.team1389.base.auton.AutonomousBase;

/**
 * This class defines where the teleop and auton bases are.
 * The code in this file wony usually have to be changed.
 */
public class Robot implements RobotCode{
	TeleopMain teleopBase;
	AutonomousMain autonomousBase;
	RobotLayout layout;
	
	public Robot(RobotLayout layout) {
		teleopBase = new TeleopMain(layout);
		autonomousBase = new AutonomousMain(layout);
		this.layout = layout;
	}

	public TeleopBase getTeleopBase() {
		return teleopBase;
	}

	public AutonomousBase getAutonomousBase() {
		return autonomousBase;
	}

	@Override
	public void setup() {
		System.out.println("Robot is initialized");
	}
}
