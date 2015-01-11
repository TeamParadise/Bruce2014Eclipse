/*
 * Robotic Drive system.
 */
package net.pvschools.robotics.javabot.practice.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This is a generic sonar subsystem.
 * Reference http://wpilib.screenstepslive.com/s/3120/m/7912/l/85774-measuring-robot-distance-to-a-surface-using-ultrasonic-sensors
 * 
 * @author John H
 */
public class Sonar extends Subsystem
{
    private final Ultrasonic Sonar;
    
    public Sonar(int PingChannel, int EchoChannel)
    {
        Sonar = new Ultrasonic(PingChannel, EchoChannel);
    }
    
    public void idle()
    {
    }
    
    public double getDistanceInInches()
	{
        Sonar.setAutomaticMode(true);
        return Sonar.getRangeInches();
    }
    

    protected void initDefaultCommand()
    {
    }
}

