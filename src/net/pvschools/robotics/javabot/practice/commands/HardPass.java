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
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 * Shoots the ball just with the action of charging the kicker piston.
 *
 * @author Team Paradise
 */
public class HardPass extends CommandGroup
{
    /**
     * @since 12/21/2012
     */
    public HardPass()
    {
        addSequential(new OpenCatcher());
        addSequential(new WaitCommand(0.2));

        /**
         * Pull latch & shoot
         */
        addSequential(new OpenLatch());
        addSequential(new WaitCommand(.2));
        addSequential(new ChargeKicker());
        addSequential(new WaitCommand(.5));

        addSequential(new ResetKicker());
        addSequential(new RetractPickup());
        addSequential(new WaitCommand(2.0));

        addSequential(new CloseLatch());
        addSequential(new WaitCommand(0.5));
        addSequential(new CloseCatcher());
    }
}
