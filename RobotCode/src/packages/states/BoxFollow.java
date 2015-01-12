package packages.states;
import packages.*;

public class BoxFollow extends StateBase{

	public BoxFollow(RobotStateVariables robotstatevariables, int robot_state){
		super(robotstatevariables, robot_state);
	}

	public void set_variables(){

		//drive train
		super.robotstatevariables.drivetrainLeftMotorSpeed = 0.8;
		super.robotstatevariables.drivetrainRightMotorSpeed = 0.8;
		//hoppers
		super.robotstatevariables.hopperPosition = 0;
		super.robotstatevariables.hopperLeftRelease = false;
		super.robotstatevariables.hopperRightRelease = false;
		//conveyor belt
		super.robotstatevariables.conveyorMotorSpeed = 0.5;
		//vision
		//camera stuff
	}
}
