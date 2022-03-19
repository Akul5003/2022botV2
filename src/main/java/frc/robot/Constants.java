/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
/*
 *   
 *   The Constants class provides a convenie  p
 * ace for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * dec
 * lared globally (i.e. public static).  Do not put anything functional in thi
 *  class. 
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int TIMEOUT = 10;
    public static final double MAX_VOLTS = 4.95;

    public static final double RotResConst = 0.0; //0.0005

    public static final int revButton = 3;
    public static final int reverseButton = 10;
    public static final int uptakeReverseButton = 9;

    public static final int intakeButton = 12;
    public static final int intakeRLButton = 11;

    public static final int uptakeButton = 6;
    public static final int magButton = 7;

    public static final int climbingArmUpButton = 8;
    public static final int climbingArmDownButton = 5;

    public static final double intakeSpeed = 0.05;
    public static final double climbingArmSpeed = 0.02;
    public static final double uptakeSpeed = 0.05;
    public static final double magSpeed = 0.02;

    public static final double limeLightAngleUp = 0; //Not final angle of limelight
    public static final double[] limeLightShooterOffset = new double[]{1, 1, 1}; //Not final limelight Shooter offset
    public static final double limeLightGoalVerticalOffset = 5; //also not final
    public static final double G = 9.80665; //assuming m/s^2
    public static final double goalRadius = 0.68; //assuming meters
}
