// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package robot.subsystems;


import robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Solenoid;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ManipulatorSubSys extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DigitalInput maniHatchDetector;
    private Solenoid hatchGrabberValve;
    private DigitalInput hatchGrabberClosedSw;
    private WPI_VictorSPX cargoMtr;
    private Solenoid selectorValve;
    private DigitalInput selector_Hatch_Pos_Sw;
    private DigitalInput maniCargoDetector;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public ManipulatorSubSys() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        maniHatchDetector = new DigitalInput(12);
        addChild("ManiHatchDetector",maniHatchDetector);
        
        
        hatchGrabberValve = new Solenoid(0, 2);
        addChild("HatchGrabberValve",hatchGrabberValve);
        
        
        hatchGrabberClosedSw = new DigitalInput(19);
        addChild("HatchGrabberClosedSw",hatchGrabberClosedSw);
        
        
        cargoMtr = new WPI_VictorSPX(8);
        
        
        
        selectorValve = new Solenoid(0, 6);
        addChild("SelectorValve",selectorValve);
        
        
        selector_Hatch_Pos_Sw = new DigitalInput(11);
        addChild("Selector_Hatch_Pos_Sw",selector_Hatch_Pos_Sw);
        
        
        maniCargoDetector = new DigitalInput(18);
        addChild("ManiCargoDetector",maniCargoDetector);
        
        

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CMDPIDGETTERS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

}

