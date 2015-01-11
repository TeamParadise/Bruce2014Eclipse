/*
 * The Piston class is for getting and opening different pistons on the Robot.
 */

package net.pvschools.robotics.javabot.practice.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This is a generic piston subsystem.
 * 
 * @author Trevor
 */
public class Piston extends Subsystem
{
    private final Solenoid solenoidOut;
    private final Solenoid solenoidIn;
    
    public Piston(int solenoidInPort, int solenoidOutPort)
    {
        this.solenoidIn = new Solenoid(solenoidInPort);
        this.solenoidOut = new Solenoid(solenoidOutPort);
    }
    
	// Solenoid module numbers are 1 and 2.
	// Solenoid modules are NOT referred to by their cRIO slot numbers.
    public Piston(int solenoidInModule, int solenoidInPort, int solenoidOutModule, int solenoidOutPort)
    {
        this.solenoidIn = new Solenoid(solenoidInModule, solenoidInPort);
        this.solenoidOut = new Solenoid(solenoidOutModule, solenoidOutPort);
    }
    
    public void extend()
    {
        solenoidIn.set(true);
        solenoidOut.set(false);
    }
    
    public void retract()
    {
        solenoidIn.set(false);
        solenoidOut.set(true);
    }
    
    public void idle()
    {
        solenoidIn.set(false);
        solenoidOut.set(false);
    }
    
    public Solenoid getInSolenoid(){
        return solenoidIn;
    }
    
    public Solenoid getOutSolenoid(){
        return solenoidOut;
    }

	protected void initDefaultCommand()
	{
	}
}
