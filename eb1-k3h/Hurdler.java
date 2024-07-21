package kareltherobot;

public class Hurdler extends ur_Robot {
	
	public Hurdler (int street, int ave, Direction dir, int beepers){
		super(street, ave, dir, beepers);
	}
	
	public void move3(){
		move();
		move();
		move();
	}
	
	public void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
}