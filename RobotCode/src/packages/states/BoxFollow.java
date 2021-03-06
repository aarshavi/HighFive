package packages.states;
import packages.*;

public class BoxFollow extends StateBase{

	public OutputStateVariables output;
	public double drive_adjustment;
	public double left_drive_speed;
	public double right_drive_speed;

	public BoxFollow(){

		output = new OutputStateVariables();

		output.drivetrainMethod = "driveTank(0.7,0.7,true)";
		output.hopperMethod = "setSorterPosition(0)";
		output.conveyorMethod = "checkFeedLimitSwitch()";
		output.visionMethod = "howCentered()";

		drive_adjustment = 0.1;
		left_drive_speed = 0.7;
		right_drive_speed = 0.7;
		
	}

	public OutputStateVariables run(InputStateVariables input){
		output.visionMethod = "howCentered()";
		if (input.howCentered>0.1){
			left_drive_speed+=drive_adjustment;
			right_drive_speed-=drive_adjustment;
		} else if (input.howCentered<0.1){
			left_drive_speed-=drive_adjustment;
			right_drive_speed+=drive_adjustment;
		} 

		if (input.howCentered>-1.0 && input.howCentered<1.0){

			String string_left_speed = Double.toString(left_drive_speed);
			String string_right_speed = Double.toString(right_drive_speed);
	
			output.drivetrainMethod = "driveTank("+string_left_speed+","+string_right_speed+",true)";

			stateStartTime = System.currentTimeMillis();
		}

		return output;
	}

	public StateBase getNext(InputStateVariables input){
		if(input.outerFeedLimitEngaged){
			return new ForwardCapture();
		}else if(System.currentTimeMillis()-stateStartTime > 1500.){
			return new BlindBoxFollow();
		} else{
			return this;
		}
	}
}
