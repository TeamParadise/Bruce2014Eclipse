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
public class PopFeedRollerSpeed extends RoboCommand
{	
	public PopFeedRollerSpeed()
	{
		requires(feedRoller);
	}
	
	protected void initialize()
	{
		feedRoller.popSpeed();
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
