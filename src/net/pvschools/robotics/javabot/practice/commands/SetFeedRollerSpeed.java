/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 *
 * @author jkoehring
 */
public class SetFeedRollerSpeed extends RoboCommand
{
	private final double speed;
	
	public SetFeedRollerSpeed(double speed)
	{
		requires(feedRoller);
		this.speed = speed;
	}
	
	protected void initialize()
	{
		feedRoller.setSpeed(speed);
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return true;
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
	}
}
