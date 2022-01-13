package frc.robot.subsystems;

import edu.wpi.first.networktables.NetworkTableInstance;
import org.strykeforce.deadeye.Deadeye;
import org.strykeforce.deadeye.Point;
import org.strykeforce.deadeye.TargetDataListener;
import org.strykeforce.deadeye.UprightRectTargetData;

public class DeadeyeH0 implements TargetDataListener<UprightRectTargetData> {

  private final Deadeye<UprightRectTargetData> deadeye;
  public int DataX;
  public int DataY;
  public DeadeyeH0
() {
    deadeye = new Deadeye<>("H0", UprightRectTargetData.class);
    deadeye.setTargetDataListener(this);
    
  }

  public DeadeyeH0
(NetworkTableInstance nti) {
    deadeye = new Deadeye<>("H0", UprightRectTargetData.class, nti);
    deadeye.setTargetDataListener(this);
  }

  public void setEnabled(boolean enabled) {
    deadeye.setEnabled(enabled);
  }

  @Override
  public void onTargetData(UprightRectTargetData data) {
    Point center = data.center;
    //System.out.printf("x=%d, y=%d %n", center.x, center.y);
    DataX = center.x;
    DataY = center.y;
  }

 
  
}
