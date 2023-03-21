// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean
 * constants. This class should not be used for any other purpose. All constants
 * should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

  //controller ids
  public static class OperatorConstants
    {

    public static final int Ritters_stick = 0;
    public static final int Brians_stick = 1;
  
  }

  //CANbus ids
  public static class canBus
  {
    
    public static final int Right1 = 1;
    public static final int Right2 = 3;

    public static final int Left1 = 0;
    public static final int Left2 = 2;
  }

  //pneumatic  ID
  public static class pneumaticIds
  {
    public static final int ArmSolenoid = 0;
    public static final int ClawSolenoid = 6;

  }
}
