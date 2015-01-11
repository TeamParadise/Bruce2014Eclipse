/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import net.pvschools.robotics.javabot.practice.Map;

/**
 *
 * @author jkoehring
 */
public class FeedRoller extends Subsystem
{
    private final Talon feedRoller = new Talon(Map.feedMotor);
	
	public static double feedSpeed = -0.8;
	public static double spewSpeed = 0.8; // in case we need to regurgitate a ball
	public static double stopSpeed = 0.0;
	
	private double speed = 0.0;
	private double previousSpeed = 0.0;
	
	protected void initDefaultCommand()
	{
	}
	
	public double popSpeed()
	{
		double oldSpeed = previousSpeed;
		setSpeed(oldSpeed);
		previousSpeed = 0;
		return oldSpeed;
	}
	
	public void pushSpeed(double newSpeed)
	{
		previousSpeed = speed;
		setSpeed(newSpeed);
	}
	
	public void setSpeed(double speed)
	{
		this.speed = speed;
		feedRoller.set(speed);
	}
}
