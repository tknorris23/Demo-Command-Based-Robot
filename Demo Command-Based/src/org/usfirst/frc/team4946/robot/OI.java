package org.usfirst.frc.team4946.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
   
	private Joystick m_driveStick = new Joystick(1);
	
	/**
	 * Get the Drive joystick
	 * 
	 * @return The driver's joystick
	 */
	public Joystick getDriveJoystick(){
		return m_driveStick;
	}
}

