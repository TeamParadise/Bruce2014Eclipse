/*
 * Input and output drivers for the robot.
 */

package net.pvschools.robotics.javabot.practice;

import edu.wpi.first.wpilibj.Compressor;

/**
 *
 * @author Trevor
 */
public class IO
{
    private static final IO instance = new IO();
    
    //private final Compressor compressor = new Compressor(Map.compressorSwitch,  Map.compressorRelay);
    
    private IO()
    {
    }
    
/*    public Compressor getCompressor()
    {
        return compressor;
    }
*/    
    public static IO getInstance()
    {
        return instance;
    }
}
