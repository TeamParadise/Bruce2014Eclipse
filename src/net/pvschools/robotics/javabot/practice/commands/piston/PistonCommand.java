/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

import net.pvschools.robotics.javabot.practice.Map;
import net.pvschools.robotics.javabot.practice.subsystems.Piston;
import net.pvschools.robotics.javabot.practice.commands.RoboCommand;

/**
 * Common base class for all commands that operate a piston.
 * 
 * The timeout is used to determine how long the solenoid should
 * be activated. Subclasses should NOT set or change the timeout.
 * 
 * @author Trevor
 */
public abstract class PistonCommand extends RoboCommand
{
    /** Piston subsystems */
    public static Piston pickupPistons =
        new Piston(Map.pickupPistonsInModule, Map.pickupPistonsInChnl, Map.pickupPistonsOutModule, Map.pickupPistonsOutChnl);
    
    public static Piston littleKickerPiston =
        new Piston(Map.littleKickerPistonInModule, Map.littleKickerPistonInChnl, Map.littleKickerPistonOutModule, Map.littleKickerPistonOutChnl);
    
    public static Piston bigKickerPiston =
        new Piston(Map.bigKickerPistonInModule, Map.bigKickerPistonInChnl, Map.bigKickerPistonOutModule, Map.bigKickerPistonOutChnl);
    
    public static Piston latchPiston =
        new Piston(Map.latchPistonInModule, Map.latchPistonInChnl, Map.latchPistonOutModule, Map.latchPistonOutChnl);
    
    public static Piston rampPiston =
        new Piston(Map.rampPistonInModule, Map.rampPistonInChnl, Map.rampPistonOutModule, Map.rampPistonOutChnl);
    
    public static Piston catcherPiston =
        new Piston(Map.catcherPistonInModule, Map.catcherPistonInChnl, Map.catcherPistonOutModule, Map.catcherPistonOutChnl);
    
    private final boolean isExtending;
    private final Piston piston;
	
	final static boolean extend = true;
	final static boolean retract = false;
	
	final static double powerOnTime = 0.05; // 50 milliseconds
    
    public PistonCommand(Piston piston, boolean isExtending)
	{
		super(powerOnTime);
		requires(piston);
        this.piston = piston;
        this.isExtending = isExtending;
    }

    protected void initialize() 
    {
        if (isExtending) 
        {
            piston.extend();
        }
		else 
        {
            piston.retract();
        }
    }

    protected void execute() 
    {
    }

    protected boolean isFinished() 
    {
        return this.isTimedOut();
    }

    protected void end() 
    {
		idle();
    }

    protected void interrupted() 
    {
		idle();
    }
    
	private void idle()
	{
		// TODO: Uncomment if want to idle the pistion when the command is finished or interrupted.
		piston.idle();
	}
}
