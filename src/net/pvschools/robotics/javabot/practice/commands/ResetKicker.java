/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

import net.pvschools.robotics.javabot.practice.commands.piston.ExtendBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractLittleKicker;

/**
 *
 * @author jkoehring
 */
public class ResetKicker extends CommandGroup
{
    public ResetKicker()
	{
		addSequential(new ExtendBigKicker());
		addSequential(new RetractLittleKicker());
	}
}
