package ca._4976;

import ca._4976.io.Input;
import ca._4976.sub.Shooter;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import ca._4976.sub.Auto;

public class Main extends IterativeRobot {

    Compressor compressor = new Compressor(20);
    Shooter shooter = new Shooter();


    public void robotInit() {

    }

    public void teleopInit() {

        compressor.setClosedLoopControl(true);

    }

    public void autonomousInit() { }

    public void testInit() { }

    public void teleopPeriodic() {

        shooter.teleopPeriodic();

        //System.out.println(Input.Digital.BALL_PRESENT.get());

    }

    public void autonomousPeriodic() { }

    public void testPeriodic() { }
}
