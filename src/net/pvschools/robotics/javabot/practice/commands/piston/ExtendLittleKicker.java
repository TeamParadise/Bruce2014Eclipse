/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

/**
 * Command to extend the return piston.
 * 
 * @author jkoehring
 */
public class ExtendLittleKicker extends PistonCommand
{
	public ExtendLittleKicker()
	{
		super(littleKickerPiston, extend);
	}
}
