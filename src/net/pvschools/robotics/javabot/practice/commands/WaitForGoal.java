/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author student
 */
class WaitForGoal extends RoboCommand
{
	int executeCount;
	
    public WaitForGoal()
    {
		requires(visionTargetSpotter);
    }

    protected void initialize()
    {
		executeCount = 0;
		visionTargetSpotter.reset();
    }

    protected void execute()
    {
		visionTargetSpotter.analyzeCameraImage();
		SmartDashboard.putNumber("Execute Count", ++executeCount);
    }

    protected boolean isFinished()
    {
        return visionTargetSpotter.isDesiredTargetHot();
    }

    protected void end()
    {
    }

    protected void interrupted()
    {
    }
}
