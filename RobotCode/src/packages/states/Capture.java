package packages.states;
import packages.states.StateBase;

public class Capture extends StateBase{
	public Capture(){
		//drivetrain.moveStraight(0.8, true);
	}	
	public void run(){
		System.out.println("running");
		//exits with 3 sec timeout
	}
}
