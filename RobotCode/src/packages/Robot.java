package packages;
import packages.subsystems.*;
import packages.states.StateBase;

public class Robot{

	public StateBase statebase;
	public int robot_state;

	public DriveTrain drivetrain;
	public Hoppers hopper;
	public ConveyorBelt conveyor;
	public Vision vision;

	public RobotStateVariables robotstatevariables;

	public Robot(){

		drivetrain = new DriveTrain();
		hopper = new Hoppers();
		conveyor = new ConveyorBelt();
		vision = new Vision();
		
		robotstatevariables = new RobotStateVariables(); 
	}

	public static void main(String[] args){
		Robot robot = new Robot();

		//implement state-system functionality here

		for (int i = 1; i<2; i++){
			robot.setState(i);
			robot.doAction();
		}
	}

        public void setState(int state){
	    robot_state = state;
        }

        public void doAction(){
	    statebase = new StateBase(robotstatevariables, robot_state);
	    statebase.run();
            //will now use robotstatevariables to move 
        }

}
