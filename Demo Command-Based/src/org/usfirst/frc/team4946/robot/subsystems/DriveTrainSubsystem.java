package org.usfirst.frc.team4946.robot.subsystems;

import org.usfirst.frc.team4946.robot.RobotMap;
import org.usfirst.frc.team4946.robot.commands.ArcadeDriveCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrainSubsystem extends Subsystem {

	// Here, we declare all of the components that are a part of this subsystem
	private RobotDrive m_robotDrive = new RobotDrive(RobotMap.frontLeftMotor,
			RobotMap.rearLeftMotor, RobotMap.frontRightMotor,
			RobotMap.rearRightMotor);

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.

		// The default command will always run if there isn't another command on
		// this subsystem being run. It's perfect for a situation like this,
		// where we're running a driving command
		setDefaultCommand(new ArcadeDriveCommand());
	}

	
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	
	public void arcadeDrive(Joystick stick) {

		// You can do a lot more control here, maybe you want to throw a
		// multiplier on the joystick's Y val or square the inputs manually or
		// something.
		
		m_robotDrive.arcadeDrive(stick);
	}

	public void stopDriving() {
		m_robotDrive.drive(0.0, 0.0);
	}
}
