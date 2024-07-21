package kareltherobot;

public class MegaHarvester extends SuperHarvester {

	public MegaHarvester(int st, int av, Direction dir, int beep){
	
		super(st,av,dir,beep);
	}
	
	public void pickBeeper(){
		super.pickBeeper();
		super.pickBeeper();
	}
	
	public void putBeeper(){
		super.putBeeper();
		super.pickBeeper();
	}
	
	public void harvest1row(){ 
		super.harvest1row();
		move();
		pickBeeper();
	}
}