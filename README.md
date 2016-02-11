package ca._4976.sub;

import ca._4976.io.Output;
import ca._4976.io.Input;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * Created by Grant on 2/9/2016.
 */
public class Auto extends IterativeRobot {
    public void autonomousInit(){}
    public void autonomousPeriodic() {

        {


            switch (AnalogInput) {
                case 0:
                    Output.PneumaticSolenoid.Intake.set(false);
                    Output.PneumaticSolenoid.HOOD.set(false);
                    Output.Motor.Left_Drive_Front.set(1.0);
                    Output.Motor.Left_Drive_Back.set(1.0);
                    Output.Motor.Right_Drive_Front.set(1.0);
                    Output.Motor.Right_Drive_Back.set(1.0);
                    break;

                if (Input.Digital.Over_Defence.get()) {

                    Output.Motor.Left_Drive_Front.set(0.0);
                    Output.Motor.Left_Drive_Back.set(0.0);
                    Output.Motor.Right_Drive_Front.set(0.0);
                    Output.Motor.Right_Drive_Back.set(0.0);

                }


                case 1:
                    Output.Motor.Left_Drive_Front.set(1.0);
                    Output.Motor.Left_Drive_Back.set(1.0);
                    Output.Motor.Right_Drive_Front.set(1.0);
                    Output.Motor.Right_Drive_Back.set(1.0);

                    if (Input.Digital.Over_Defence.get()) {

                        Output.Motor.Left_Drive_Front.set(0.0);
                        Output.Motor.Left_Drive_Back.set(0.0);
                        Output.Motor.Right_Drive_Front.set(0.0);
                        Output.Motor.Right_Drive_Back.set(0.0);


                    }

            }
        }
    }
}
