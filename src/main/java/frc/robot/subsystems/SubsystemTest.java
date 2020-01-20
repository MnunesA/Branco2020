/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemTest extends SubsystemBase {

  private int MOTOR_TT_ID;
  private double speed_commandTest;
  private double SPEED_COMMANDTEST_DF;

  private VictorSP victorSPTeste;

  public SubsystemTest(int MOTOR_TEST_ID, double SPEED_COMMANDTEST_DEFAULT) {
    this.MOTOR_TT_ID = MOTOR_TEST_ID;
    this.SPEED_COMMANDTEST_DF = SPEED_COMMANDTEST_DEFAULT;
    
    this.victorSPTeste = new VictorSP(MOTOR_TT_ID);
  }

  public void setSpeed(double speed) {
    this.victorSPTeste.set(speed);
  }

  @Override
  public void periodic() {
    this.speed_commandTest = SmartDashboard.getNumber("Speed_CommandTest_Change", SPEED_COMMANDTEST_DF);
    SmartDashboard.putNumber("Speed_CommandTest_Current", speed_commandTest);
  }
}
