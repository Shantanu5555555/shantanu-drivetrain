// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new Driv
   * eTrain. */
  public DriveTrain() {}
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  private WPI_TalonFX frontLeft = new WPI_TalonFX(3);
  private WPI_TalonFX frontRight = new WPI_TalonFX(1);
  private WPI_TalonFX backLeft = new WPI_TalonFX(4);
  private WPI_TalonFX backRight = new WPI_TalonFX(2);
  public void mover(double speed){
    frontRight.set(ControlMode.PercentOutput, speed);
    backRight.set(ControlMode.PercentOutput, speed);
  }
  public void movel(double speed){
    frontLeft.set(ControlMode.PercentOutput, -speed);
    backLeft.set(ControlMode.PercentOutput, -speed);  
  }
}
