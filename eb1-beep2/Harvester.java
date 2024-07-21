package kareltherobot;

public class Harvester extends Robot {
	public Harvester (int st, int av, Direction dir, int beep) {
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