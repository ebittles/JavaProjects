package kareltherobot;

public class Harvest extends ur_Robot {
	public Harvest (int st, int av, Direction dir, int beep) {
		super(st,av,dir,beep);
	}
	
	public void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	public void repoLeft(){
		turnRight();
		move();
		turnRight();
	}
	
	public void repoRight(){
		turnLeft();
		move();
		turnLeft();
	}
	
	public void harvest1row(){
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
		move();
		pickBeeper();
	}
	
	public void harvest2rows(){
		harvest1row();
		repoRight();
		harvest1row();
		repoLeft();
	}
}