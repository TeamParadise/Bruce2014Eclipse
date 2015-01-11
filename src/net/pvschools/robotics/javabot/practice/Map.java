/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.pvschools.robotics.javabot.practice;

/**
 *
 * @author student
 */
public class Map
{
   // Wheel motors: Digital I/O PWM
   public static final int frontleft             = 1;
   public static final int frontright            = 2;
   public static final int backleft              = 3;
   public static final int backright             = 4;
   
   //Feed Motor: Digital I/O PWM
   public static final int feedMotor             = 5;
   
   //Joystick Ports
   public static final int joystickPort1          = 1;
   public static final int joystickPort2          = 2;
           
   //Joystick Ports
   public static final int gyroPort              = 1;
           
   //Ultrasonic Sensor Port
   public static final int ultrasonic            = 4;
   
   //Compressor Ports
   public static final int compressorSwitch      = 1;   // Digital I/O
   public static final int compressorRelay       = 1;   // relay
   
   // Solenoid Ports
   // Solenoid ports are referenced by MODULE and channel.
   // The solenoid module in slot 3 is module 1.
   // The solenoid module in slot 7 is module 2.
   public static final int pickupPistonsInModule       = 2;
   public static final int pickupPistonsInChnl         = 3;
   public static final int pickupPistonsOutModule      = 2;
   public static final int pickupPistonsOutChnl        = 6;
   
   public static final int latchPistonInModule         = 1;
   public static final int latchPistonInChnl           = 2;
   public static final int latchPistonOutModule        = 1;
   public static final int latchPistonOutChnl          = 5;
   
   public static final int bigKickerPistonInModule     = 1;
   public static final int bigKickerPistonInChnl       = 3;
   public static final int bigKickerPistonOutModule    = 1;
   public static final int bigKickerPistonOutChnl      = 6;
   
   public static final int littleKickerPistonInModule  = 1;
   public static final int littleKickerPistonInChnl    = 1;
   public static final int littleKickerPistonOutModule = 1;
   public static final int littleKickerPistonOutChnl   = 4;
   
   public static final int rampPistonInModule          = 2;
   public static final int rampPistonInChnl            = 1;
   public static final int rampPistonOutModule         = 2;
   public static final int rampPistonOutChnl           = 4;
   
   public static final int catcherPistonInModule       = 2;
   public static final int catcherPistonInChnl         = 5;
   public static final int catcherPistonOutModule      = 2;
   public static final int catcherPistonOutChnl        = 2;

   //Sonar Ports
   public static final int sonarPingChannel      = 2;   // Digital I/O
   public static final int sonarEchoChannel      = 3;   // Digital I/O
}
