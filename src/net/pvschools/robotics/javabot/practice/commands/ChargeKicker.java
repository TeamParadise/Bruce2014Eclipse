/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import net.pvschools.robotics.javabot.practice.commands.piston.RetractBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendLittleKicker;

/**
 *
 * @author jkoehring
 */
public class ChargeKicker extends CommandGroup
{
	public ChargeKicker()
	{
		addSequential(new RetractBigKicker());
		addSequential(new ExtendLittleKicker());
	}
}
