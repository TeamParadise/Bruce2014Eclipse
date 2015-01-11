/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.LowerRamp;

/**
 *
 * @author student
 */
public class StartPickup extends CommandGroup
{    
    public StartPickup()
	{
		addParallel(new SetFeedRollerSpeed(FeedRoller.feedSpeed));
        addSequential(new ExtendPickup(null));
		addSequential(new WaitCommand(0.2));
        addParallel(new OpenCatcher());
        addSequential(new LowerRamp());
    }
}
