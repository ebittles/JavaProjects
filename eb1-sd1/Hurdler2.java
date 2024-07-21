package kareltherobot;

public class Hurdler2 extends Robot2 {
	
	public Hurdler2(int st, int av, Direction dir, int beep){
		
		super(st,av,dir,beep);
		
	}
	
	public void clearHurdle(){
		upHurdle();
		overHurdle();
		downHurdle();
	}
	
	public void upHurdle(){
		while(!rightIsClear()){
			move();
		}
	}
	
	public void overHurdle(){
		if(rightIsClear()){
			turnRight();
			move();
			turnRight();
		}
	}
	
	
	public void downHurdle(){	
		while(frontIsClear()){
			move();
		}
		turnLeft();
		
		int i = 0;
		while(frontIsClear()){
			if(i<=4){
				if(nextToABeeper()){
					pickBeeper();
				}
				move();
				i++;
			}else{
				turnOff();
				break;
			}
			
		}
		
		turnLeft();
	}
	
}

