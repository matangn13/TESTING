package org.usfirst.frc.team2212.robot;


import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.VictorSP;

public class SubsystemComponents {
		public static final VictorSP MOTOR_A = new VictorSP(RobotMap.PWM.MOTOR_A);
		public static final VictorSP MOTOR_B = new VictorSP(RobotMap.PWM.MOTOR_B);
		public static final DigitalInput LIMIT_SWITCH_A1 = new DigitalInput(RobotMap.DIO.LIMIT_A1);
		public static final DigitalInput LIMIT_SWITCH_A2 = new DigitalInput(RobotMap.DIO.LIMIT_A2);
		public static final DigitalInput LIMIT_SWITCH_B1 = new DigitalInput(RobotMap.DIO.LIMIT_B1);
		public static final DigitalInput LIMIT_SWITCH_B2 = new DigitalInput(RobotMap.DIO.LIMIT_B2);
}
