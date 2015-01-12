package packages.states;
import packages.*;

public class BlindBoxFollow extends StateBase{
	
	public OutputStateVariables output;

	public BlindBoxFollow(){

		output = new OutputStateVariables();

		output.drivetrainOutputMethod = "setClockwiseTurn(.5)";
		output.hopperOutputMethod = "setSorterPosition(0)";
		output.conveyorOutputMethod = "moveBelt(false)";
		output.visionOutputMethod = "senseTarget()";
		
	}

	public OutputStateVariables run(){
		return output;
	}

	public StateBase getNext(InputStateVariables input){
		if(System.currentTimeMillis()-stateStartTime > 4000.){
			return new BoxSearch();
		} else{
			return this;
		}
	}
}
