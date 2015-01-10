package packages.states;
import packages.states.StateBase;

public class BoxFollow extends StateBase{
	public BoxFollow(){
		drivetrain.setCounterClockwiseTurn(0.5);
	}	
	public void run(){
		System.out.println("running");
	}
}