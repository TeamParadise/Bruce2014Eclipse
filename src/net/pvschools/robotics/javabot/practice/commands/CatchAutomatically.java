/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

/**
 * Possible implementation of a command that automatically catches a ball
 * based upon feedback from an ultrasonic sensor.
 *
 * @author jkoehring
 */
public class CatchAutomatically extends RoboCommand
{

	protected void initialize()
	{
	}

	protected void execute()
	{
	}

	protected boolean isFinished()
	{
		return isTimedOut();
	}

	protected void end()
	{
	}

	protected void interrupted()
	{
	}
	
}

// The following by J. Hassett:
//
//        private static Boolean catching;
//        if (button12.get())
//        {
//           Sonar Sonar = new Sonar(Map.SonarPingChannel,Map.SonarEchoChannel);
//           if (Sonar.getDistanceInInches()<13 and !catching)
//           {
//              CloseCatcher Catcher = new CloseCatcher();
//              Catcher.start();
//              catching = true;
//           } else
//           {
//               catching = false;
//           }
//        }
        

