/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ExampleCommand;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class MotorLimit extends Subsystem {
  double voltage = 0;
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ExampleCommand());
  }
  public void moveBackward() {
    voltage = RobotMap.dial.getVoltage()/5;
    RobotMap.motor.set(-voltage);
    RobotMap.motor2.set(-voltage);
  } 
  public void moveFoward() {
    voltage = RobotMap.dial.getVoltage()/5;
    RobotMap.motor.set(voltage);
    RobotMap.motor2.set(voltage);
  }
  public boolean isBackwardPressed() { 
    System.out.println("Backward");
    return !RobotMap.backward.get();
  }

  public boolean isForwardPressed() {
    System.out.println("Forward");
    return !RobotMap.forward.get();
  }

  public void stopMotors() {
    RobotMap.motor.stopMotor();
    RobotMap.motor2.stopMotor();
  }

  // Set the default command for a subsystem here.
  // setDefaultCommand(new MySpecialCommand());

}
