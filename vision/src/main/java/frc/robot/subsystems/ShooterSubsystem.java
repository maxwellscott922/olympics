package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

import org.strykeforce.deadeye.Deadeye;
import org.strykeforce.deadeye.Point;
import org.strykeforce.deadeye.TargetDataListener;
import org.strykeforce.deadeye.UprightRectTargetData;


public class ShooterSubsystem extends SubsystemBase {

  DeadeyeH0 deadeyeH0 = RobotContainer.DEADEYE;

 public void shoot()
  {
    //System.out.printf( "x=%d, y=%d %n", deadeyeH0.DataX, deadeyeH0.DataY);

    System.out.println(deadeyeH0.DataY);
    System.out.println(deadeyeH0.DataX);
  }
}
