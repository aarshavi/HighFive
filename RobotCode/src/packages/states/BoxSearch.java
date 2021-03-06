package packages.states;
import packages.*;

public class BoxSearch extends StateBase{

	public OutputStateVariables output;

	public BoxSearch(){

		output = new OutputStateVariables();

		output.drivetrainMethod = "setClockwiseTurn(.5)";
		output.hopperMethod = "setSorterPosition(0)";
		output.conveyorMethod = "moveBelt(false)";
		output.visionMethod = "senseTarget()";
		
	}

	public OutputStateVariables run(InputStateVariables input){
		return output;
	}

	public StateBase getNext(InputStateVariables input){
		if(System.currentTimeMillis()-stateStartTime > 5000. ){
			return new BoxFollow();
		}else if(input.gyroAngle > 360.0){
			return new WallSearch();
		} else {
			return this;
		}
	}

}
