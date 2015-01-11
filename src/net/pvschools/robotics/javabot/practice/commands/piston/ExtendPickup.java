/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.pvschools.robotics.javabot.practice.commands.piston;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Command to extend the pickup pistons.
 * 
 * @author jkoehring
 */
public class ExtendPickup extends PistonCommand
{
    private String dashboardFlag;
    
	public ExtendPickup(String dashboardFlag)
	{
		super(pickupPistons, retract);
        this.dashboardFlag = dashboardFlag;
	}
    
    protected void initialize()
    {
        if (dashboardFlag == null || SmartDashboard.getBoolean(dashboardFlag))
        {
            super.initialize();
        }
    }
}
