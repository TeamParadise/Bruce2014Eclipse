/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Class for driving the robot at a fixed speed and direction.
 *
 * @author robostud
 */
public class DriveDirectional extends RoboCommand
{
    private double magnitude;
    private double direction;
    private double rotation;
	
	// The following are smart dashboard keys:
	private String magnitudeKey = null;
	private String directionKey = null;
	private String timeoutKey = null;
        private String rotationKey = null;
    
    /** Specifies speed and direction to drive the robot
     * 
     * @param magnitude "Speed"
     * @param direction Direction in degrees
     * @param rotation
     */
    public DriveDirectional(double magnitude, double direction, double rotation)
    {
        requires(driveTrain);
        this.magnitude = magnitude;
        this.direction = direction;
        this.rotation = rotation;
    }

    /** 
     * Uses values from the smart dashboard to drive the robot
     * @param magnitudeKey
     * @param directionKey
     * @param timeoutKey 
     * @param rotationKey 
     */
    public DriveDirectional(String magnitudeKey, String directionKey, String rotationKey, String timeoutKey)
    {
        requires(driveTrain);
        this.magnitudeKey = magnitudeKey;
        this.directionKey = directionKey;
        this.rotationKey = rotationKey;
		this.timeoutKey = timeoutKey;
    }

    // Called just before this Command runs the first time
    protected void initialize()
    {
		// See if we are using values from the smart dashboard:
		if (null != magnitudeKey)
		{
			magnitude = SmartDashboard.getNumber(magnitudeKey);
			direction = SmartDashboard.getNumber(directionKey);
			rotation = SmartDashboard.getNumber(rotationKey);
			setTimeout(SmartDashboard.getNumber(timeoutKey));
		}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
        driveTrain.drivePolar(magnitude, direction, rotation);
    }

    // Note that when there is no timeout value set, this will return false.
    protected boolean isFinished()
    {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end()
    {
        stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
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
