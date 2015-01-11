/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to retract the latch piston.
 * 
 * @author jkoehring
 */
public class CloseLatch extends PistonCommand
{
	public CloseLatch()
	{
		super(latchPiston, extend);
	}
}
