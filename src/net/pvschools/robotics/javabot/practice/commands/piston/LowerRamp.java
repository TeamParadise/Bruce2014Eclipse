/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the ramp lifter piston.
 * 
 * @author jkoehring
 */
public class LowerRamp extends PistonCommand
{
	public LowerRamp()
	{
            //Backwards
		super(rampPiston, extend);
	}
}
