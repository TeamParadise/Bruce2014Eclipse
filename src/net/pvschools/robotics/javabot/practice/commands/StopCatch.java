/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.RaiseRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 *
 * @author Team Paradise
 */
public class StopCatch extends CommandGroup
{    
    public StopCatch()
	{
        addSequential(new RaiseRamp());
        addSequential(new CloseCatcher());
        addSequential(new RetractPickup());
    }
}

