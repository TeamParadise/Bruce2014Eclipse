/*
 * Operator Interface methods
 */
package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import net.pvschools.robotics.javabot.practice.commands.ChargeKicker;
import net.pvschools.robotics.javabot.practice.commands.HardPass;
import net.pvschools.robotics.javabot.practice.commands.PopFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.PrimeRobot;
import net.pvschools.robotics.javabot.practice.commands.PushFeedRollerSpeed;
import net.pvschools.robotics.javabot.practice.commands.ResetKicker;
import net.pvschools.robotics.javabot.practice.commands.StartPickup;
import net.pvschools.robotics.javabot.practice.commands.StopPickup;
import net.pvschools.robotics.javabot.practice.commands.Shoot;
import net.pvschools.robotics.javabot.practice.commands.SoftPass;
import net.pvschools.robotics.javabot.practice.commands.StartCatch;
import net.pvschools.robotics.javabot.practice.commands.StopCatch;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.CloseLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendLittleKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.ExtendPickup;
import net.pvschools.robotics.javabot.practice.commands.piston.LowerRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenCatcher;
import net.pvschools.robotics.javabot.practice.commands.piston.OpenLatch;
import net.pvschools.robotics.javabot.practice.commands.piston.RaiseRamp;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractBigKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractLittleKicker;
import net.pvschools.robotics.javabot.practice.commands.piston.RetractPickup;
import net.pvschools.robotics.javabot.practice.subsystems.FeedRoller;

public class OI
{
    private static final OI instance = new OI();

    private final Joystick mainJoystick = new Joystick(Map.joystickPort1);
    private final Joystick secondaryJoystick = new Joystick(Map.joystickPort2);
    
    /** Shoot */
    private final Button mainButton1 = new JoystickButton(mainJoystick, 1);
    private final Button secondaryButton1 = new JoystickButton(secondaryJoystick, 1);
    
    private final Button mainButton2 = new JoystickButton(mainJoystick, 2);
    private final Button secondaryButton2 = new JoystickButton(secondaryJoystick, 2);
    
    private final Button mainButton3 = new JoystickButton(mainJoystick, 3);
    private final Button secondaryButton3 = new JoystickButton(secondaryJoystick, 3);
    
    private final Button mainButton4 = new JoystickButton(mainJoystick, 4);
    private final Button secondaryButton4 = new JoystickButton(secondaryJoystick, 4);
    
    private final Button mainButton5 = new JoystickButton(mainJoystick, 5);
    private final Button secondaryButton5 = new JoystickButton(secondaryJoystick, 5);
   
    private final Button mainButton6 = new JoystickButton(mainJoystick, 6);
    private final Button secondaryButton6 = new JoystickButton(secondaryJoystick, 6);
    
    private final Button mainButton7 = new JoystickButton(mainJoystick, 7);
    private final Button secondaryButton7 = new JoystickButton(secondaryJoystick, 7);
    
    private final Button mainButton8 = new JoystickButton(mainJoystick, 8);
    private final Button secondaryButton8 = new JoystickButton(secondaryJoystick, 8);
    
    private final Button mainButton9 = new JoystickButton(mainJoystick, 9);
    private final Button secondaryButton9 = new JoystickButton(secondaryJoystick, 9);
   
    private final Button mainButton10 = new JoystickButton(mainJoystick, 10);
    private final Button secondaryButton10 = new JoystickButton(secondaryJoystick, 10);
    
    private final Button mainButton11 = new JoystickButton(mainJoystick, 11);
    private final Button secondaryButton11 = new JoystickButton(secondaryJoystick, 11);
    
    private final Button mainButton12 = new JoystickButton(mainJoystick, 12);
    private final Button secondaryButton12 = new JoystickButton(secondaryJoystick, 12);

    private OI()
    {
        SmartDashboard.putNumber("Dampening", .9);
		
		// Add commands to smart dashboard:
		SmartDashboard.putData(new OpenCatcher());
		SmartDashboard.putData(new CloseCatcher());
		SmartDashboard.putData(new RaiseRamp());
		SmartDashboard.putData(new LowerRamp());
		SmartDashboard.putData(new ExtendPickup("Extend Pickup"));
		SmartDashboard.putData(new RetractPickup());
		SmartDashboard.putData(new ChargeKicker());
		SmartDashboard.putData(new ResetKicker());
		SmartDashboard.putData(new ExtendLittleKicker());
		SmartDashboard.putData(new RetractLittleKicker());
		SmartDashboard.putData(new ExtendBigKicker());
		SmartDashboard.putData(new RetractBigKicker());
		SmartDashboard.putData(new OpenLatch());
		SmartDashboard.putData(new CloseLatch());
		SmartDashboard.putData(new PrimeRobot());
        
        SmartDashboard.putBoolean("Extend Pickup", false);
		
        //Button Command Initialization
        
        // Chargin
        mainButton1.whenPressed(new ChargeKicker());  // standard shot charge
        secondaryButton1.whenPressed(new ChargeKicker());  // standard shot charge
        // Shooting
        mainButton1.whenReleased(new Shoot(false, "Extend Pickup"));  // standard shot
        secondaryButton1.whenReleased(new Shoot(false, "Extend Pickup"));  // standard shot

        mainButton5.whenPressed(new Shoot(true, "Extend Pickup"));   // quick shot
        secondaryButton5.whenPressed(new Shoot(true, "Extend Pickup"));   // quick shot
        
        // Picking up and spewing
        mainButton2.whenPressed(new StartPickup());
        mainButton2.whenReleased(new StopPickup());
		
        secondaryButton2.whenPressed(new StartPickup());
        secondaryButton2.whenReleased(new StopPickup());
		
		mainButton11.whenPressed(new PushFeedRollerSpeed(FeedRoller.spewSpeed));
		mainButton11.whenReleased(new PopFeedRollerSpeed());
		
		secondaryButton11.whenPressed(new PushFeedRollerSpeed(FeedRoller.spewSpeed));
		secondaryButton11.whenReleased(new PopFeedRollerSpeed());
        
        // Passing
        mainButton3.whenPressed(new HardPass());
        secondaryButton3.whenPressed(new HardPass());
                
        mainButton4.whenPressed(new SoftPass());
        secondaryButton4.whenPressed(new SoftPass());        
        
        // Catching
        mainButton6.whenPressed(new StartCatch("Extend Pickup"));
        mainButton6.whenReleased(new StopCatch());
        
        secondaryButton6.whenPressed(new StartCatch("Extend Pickup"));
        secondaryButton6.whenReleased(new StopCatch());
        
        mainButton12.whenPressed(new PrimeRobot());
        secondaryButton12.whenPressed(new PrimeRobot());
    }
    
    public double getDampening()
    {
        return SmartDashboard.getNumber("Dampening");
    }
    
    public double getDriveThrottle()
    {
        return mainJoystick.getThrottle();
    }
    
    public double getDriveX()
    {
        return mainJoystick.getY();
    }
    
    public double getDriveY()
    {
        return mainJoystick.getX();
    }
    
    public double getDriveTwist()
    {
        return mainJoystick.getTwist();
    }
    
    public static OI getInstance()
    {
        return instance;
    }
}
