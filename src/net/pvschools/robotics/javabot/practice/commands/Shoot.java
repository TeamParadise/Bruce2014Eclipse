/*
 * 
 */
package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;

import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;

/**
 *
 * @author Trevor
 * @author Bryce
 */
public class Shoot extends CommandGroup
{
    // These define how long to wait after shooting the
    // ball before discharging the big kicker piston.
    private final double standardShotDelay = 0.2; // 200 milliseconds
    private final double quickShotDelay = 0.1; // 100 milliseconds
    /**
     * @since 12/21/2012
     * @param quickshot Shoot fast
     * @param extendPickup Extend pickup before shooting
     */
    public Shoot(boolean quickshot, String extendPickupDashboardFlag)
    {
        addSequential(new OpenCatcher());
        
        addSequential(new ExtendPickup(extendPickupDashboardFlag));
        addSequential(new WaitCommand(0.2));

        /**
         * Pull latch & shoot
         */
        addSequential(new OpenLatch());
        addSequential(new WaitCommand(quickshot ? quickShotDelay : standardShotDelay));

        addSequential(new ResetKicker());
        addSequential(new RetractPickup());
        addSequential(new WaitCommand(2.0));

        addSequential(new CloseLatch());
		addSequential(new WaitCommand(1));

//        addSequential(new ChargeKicker());
//        addSequential(new WaitCommand(1.5));
        addSequential(new CloseCatcher());
    }
}
