package packages.subsystems;
//import jmraa.*;

public class DriveTrain{
	public DriveTrain(){
		System.out.println("Hello DriveTrain!");
	}
	
	public void moveStraight(double speed){
		//setLeftSpeed(speed);
		//setRightSpeed(speed);
	}
	public void setClockwiseTurn(double speed){
		//setLeftSpeed(speed);
		//setRightSpeed(-speed);
	}
	public void setCounterClockwiseTurn(double speed){
		//setLeftSpeed(-speed);
		//setRightSpeed(speed);
	}
	
	public void stop(){
		moveStraight(0);
	}
	public double readGyroAngle(){
		//read SPI
		return 10;
	}
	public void resetGyro(){
		//reset gyro
	}
}