package packages.states;
import packages.*;

public class StateBase{

	public OutputStateVariables run(){
		return new OutputStateVariables();
	}

	public StateBase getNext(InputStateVariables inputstatevariables){
		return this;
	}

		
}
