/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.CommandTest;
import frc.robot.subsystems.SubsystemTest;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.Constants;

public class RobotContainer {

  private static SubsystemTest subsTest;
  private static XboxController xboxController;
  private static JoystickButton A;
  private static CommandTest commTest;

  public RobotContainer() {

    subsTest =
        new SubsystemTest(Constants.MOTOR_TEST_ID, Constants.SPEED_COMMANDTEST);

    xboxController = new XboxController(Constants.XBOX_ID);

    commTest = new CommandDriver(subsTest);

    configureButtonBindings();
  }

  private void configureButtonBindings() {
    A = new JoystickButton(xboxController, Constants.XBOX_A_NUMBER);
    A.whileHeld(commTest);
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */

  /*
    public Command getAutonomousCommand() {
      // An ExampleCommand will run in autonomous
      return m_autoCommand;
    }
  */

  public static SubsystemDriver subsTest() {
    return subsTest;
  }

  public static XboxController xboxController() {
    return xboxController;
  }

  public static Command commTest() {
    return commTest;
  }
}
