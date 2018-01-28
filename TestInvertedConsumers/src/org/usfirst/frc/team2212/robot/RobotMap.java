/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static interface PWM {
		public static final int MOTOR_A = 0;
		public static final int MOTOR_B = 1;
	}

	public static interface DIO {
		public static final int LIMIT_A1 = 0;
		public static final int LIMIT_A2 = 1;
		public static final int LIMIT_B1 = 2;
		public static final int LIMIT_B2 = 3;
	}

}
