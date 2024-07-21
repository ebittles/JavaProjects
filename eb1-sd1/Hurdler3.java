package kareltherobot;

public class Hurdler3 extends Hurdler2 {
	public Hurdler3(int st, int av, Direction dir, int beep){
		super(st,av,dir,beep);
	}
	
	@Override
	public void overHurdle(){
		if(rightIsClear()){
			turnRight();
			move();
		}
		while(!rightIsClear()){
			move();
		}
		turnRight();
	}
}