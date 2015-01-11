/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.LowerRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;

/**
 *
 * @author Team Paradise
 */
public class StartCatch extends CommandGroup
{    
    
    public StartCatch(String extendPickupDashboardFlag)
    {
        addSequential(new ExtendPickup(extendPickupDashboardFlag));
        addSequential(new WaitCommand(0.2));
        addSequential(new OpenCatcher());
        addSequential(new LowerRamp());
    }
}
