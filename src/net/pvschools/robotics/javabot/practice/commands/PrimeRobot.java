/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 *
 * @author student
 */
public class PrimeRobot extends CommandGroup {
    
    public PrimeRobot(){
        addSequential(new ResetKicker());
        addSequential(new WaitCommand(1));
        addSequential(new OpenLatch());
        addSequential(new RetractPickup());
        addSequential(new WaitCommand(1));

        addSequential(new CloseLatch());
		addSequential(new WaitCommand(1));

        addSequential(new CloseCatcher());
    }
    
}
