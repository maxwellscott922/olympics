// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

import org.strykeforce.deadeye.UprightRectTargetData;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.InstantCommand;

/** An example command that uses an example subsystem. */
public class ShootCommand extends InstantCommand {
  
  private static ShooterSubsystem SHOOTAH = RobotContainer.SHOOTAH;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ShootCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    
    addRequirements(SHOOTAH);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {
    SHOOTAH.shoot();
  }

 
}
