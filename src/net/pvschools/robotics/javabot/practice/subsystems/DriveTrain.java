/*
 * Robotic Drive system.
 */
package net.pvschools.robotics.javabot.practice.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import net.pvschools.robotics.javabot.practice.Map;
import net.pvschools.robotics.javabot.practice.commands.DriveWithJoysticks;

public class DriveTrain extends PIDSubsystem
{
    private static final double Kp = 3;
    private static final double Ki = .2;
    private static final double Kd = 0.0;
    
    RobotDrive drive;

    public DriveTrain()
    {
        super("DriveTrain", Kp, Ki, Kd);
        drive = new RobotDrive(new Talon(Map.frontleft),
                new Talon(Map.frontright), 
                new Talon(Map.backleft), 
                new Talon(Map.backright));
        
        drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
    }
    
    public void initDefaultCommand()
    {
         setDefaultCommand(new DriveWithJoysticks());       
    }
    
    protected void usePIDOutput(double output)
    {
        
    }

    protected double returnPIDInput()
    {
        return 0D;
    }
    
    /**
     * Drives in a Cartesian coordinate field
     * @deprecated 
     * @param x         X "speed"
     * @param y         Y "speed"
     * @param twist     Spin "speed"
     * @param gyroAngle Gyro angle
     */
    public void driveCartesian(double x, double y, double twist, double gyroAngle)
    {
        drive.mecanumDrive_Cartesian(x, y, twist, gyroAngle);
    }    
    
    /**
     * Drives in a polar coordinate field
     * @param magnitude "Speed"
     * @param direction Angle in degrees
     * @param rotation  Spin "speed"
     */
    public void drivePolar(double magnitude, double direction, double rotation)
    {
        drive.mecanumDrive_Polar(magnitude, direction, rotation);
    }
    
}
