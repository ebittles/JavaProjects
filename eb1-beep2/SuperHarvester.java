package kareltherobot;

public class SuperHarvester extends Harvester {
	
	public SuperHarvester(int st, int av, Direction dir, int beep){
		super(st,av,dir,beep);
	}
	
	
	@Override
	public void harvest1row(){
		for(int i=0;i<5;i++){
			while(nextToABeeper()){
				pickBeeper();
			}
			putBeeper();
			move();
		}
		while(nextToABeeper()){
			pickBeeper();
		}
		putBeeper();
	}
}