/*
 * 
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;

/**
 *
 * @author Trevor
 */
public class RunAutonomous extends CommandGroup
{
    public RunAutonomous()
    {
		// Add elements to smart dashboard for driving forward:
		SmartDashboard.putNumber("Forward Spd", .6);
		SmartDashboard.putNumber("Forward Dir", 270);
		SmartDashboard.putNumber("Forward Rot", 0);
		SmartDashboard.putNumber("Forward Sec", 0.65);
        
		// Add elements to smart dashboard for driving sideways:
		SmartDashboard.putNumber("Sideways Spd", 0);
		SmartDashboard.putNumber("Sideways Dir", 0);
		SmartDashboard.putNumber("Sideways Rot", 0);
		SmartDashboard.putNumber("Sideways Sec", 0);
        
        addSequential(new ChargeKicker());
        
 		addSequential(new DriveDirectional("Forward Spd", "Forward Dir", "Forward Rot", "Forward Sec"));
		
		// Intended for driving sideways:
		addSequential(new DriveDirectional("Sideways Spd", "Sideways Dir", "Sideways Rot", "Sideways Sec"));
		
        addSequential(new WaitForGoal(), 4.5);
        addSequential(new Shoot(false, "Extend Pickup"));
    }    
}
