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
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class IntakeSubSys extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private DoubleSolenoid intakeLiftValve;
    private DigitalInput hatchSensor;
    private Solenoid intakeRollerLiftValve;
    private DigitalInput liftRaisedSw;
    private DigitalInput liftMidSw;
    private DigitalInput liftLoweredSw;
    private DigitalInput rollerLoweredSw;
    private DigitalInput rollerRaisedSw;
    private WPI_VictorSPX intakeRollerMtr;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public IntakeSubSys() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        intakeLiftValve = new DoubleSolenoid(0, 0, 1);
        addChild("IntakeLiftValve",intakeLiftValve);
        
        
        hatchSensor = new DigitalInput(5);
        addChild("HatchSensor",hatchSensor);
        
        
        intakeRollerLiftValve = new Solenoid(0, 3);
        addChild("IntakeRollerLiftValve",intakeRollerLiftValve);
        
        
        liftRaisedSw = new DigitalInput(2);
        addChild("LiftRaisedSw",liftRaisedSw);
        
        
        liftMidSw = new DigitalInput(1);
        addChild("LiftMidSw",liftMidSw);
        
        
        liftLoweredSw = new DigitalInput(0);
        addChild("LiftLoweredSw",liftLoweredSw);
        
        
        rollerLoweredSw = new DigitalInput(3);
        addChild("RollerLoweredSw",rollerLoweredSw);
        
        
        rollerRaisedSw = new DigitalInput(4);
        addChild("RollerRaisedSw",rollerRaisedSw);
        
        
        intakeRollerMtr = new WPI_VictorSPX(4);
        
        
        

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

