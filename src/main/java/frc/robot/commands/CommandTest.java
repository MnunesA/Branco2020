/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.SubsystemTest;

public class CommandTest extends CommandBase {

  private SubsystemTest subsTest;
  private double speed;

  public CommandTest(SubsystemTest subsystemT) {
    this.subsTest = subsystemT;
    addRequirements(subsTest);
  }

  @Override
  public void execute() {
  this.speed = this.subsTest.speed_CommandTest;
  this.subsTest.setSpeed(this.speed);
}
  @Override
  public boolean isFinished() {
    return false;
  }
}
