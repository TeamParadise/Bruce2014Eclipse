/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.OI;

/**
 * Drives the robot using input from the joysticks.
 * 
 * @author student
 */
public class DriveWithJoysticks extends RoboCommand
{
    public DriveWithJoysticks()
    {
        requires(driveTrain);
    }

    protected void initialize() 
    {
    }

    protected void execute() 
    { 
        double dampingFactor = OI.getInstance().getDampening();       // Between 0 and 1; 0 = No damping 

        double calX     = OI.getInstance().getDriveX();
        double calY     = OI.getInstance().getDriveY(); 
        double calTwist = OI.getInstance().getDriveTwist(); 

        calX     = dampingFactor*calX*calX*calX             + (1-dampingFactor)*calX; 
        calY     = dampingFactor*calY*calY*calY             + (1-dampingFactor)*calY; 
        calTwist = dampingFactor*calTwist*calTwist*calTwist + (1-dampingFactor)*calTwist; 

		double magnitude = Math.sqrt((calY * calY) + (calX * calX));
		double direction = Math.toDegrees(Math.atan2(calY, calX)) + 90;
		
        SmartDashboard.putNumber(" magnitude ", magnitude);
        SmartDashboard.putNumber(" direction ", direction);
        SmartDashboard.putNumber(" rotation ", -calTwist);

        driveTrain.drivePolar(magnitude, direction, -calTwist);
    }
    
    // This command never finishes.
    protected boolean isFinished() 
    {
        return false;
    }

    protected void end() 
    {
        stop();
    }

    protected void interrupted() 
    {
        stop();
    }
    
    /** Stop all drive motion */
    private void stop()
    {
        driveTrain.drivePolar(0, 0, 0);
    }
}