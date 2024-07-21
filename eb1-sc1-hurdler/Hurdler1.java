package kareltherobot;

public class Hurdler1 extends Robot2 {
	
	public Hurdler1(int st, int av, Direction dir, int beep){
		
		super(st,av,dir,beep);
		
	}
	
	public void clearHurdle(){
		moveToHurdle();
		upHurdle();
		overHurdle();
		downHurdle();
	}
	
	public void upHurdle(){
		for(int i=0;i<=8;i++){
			if(!rightIsClear()){
				move();
			}
		
		}
	}
	
	public void overHurdle(){
		if(rightIsClear()){
			turnRight();
			move();
			turnRight();
			move();
		}
	}
	
	
	
	public void downHurdle(){	
		for(int i=0;i<=8;i++){
			if((!rightIsClear())&&(frontIsClear())){
				move();
			}

		}
		
		turnLeft();
		
	}
	
	public void moveToHurdle(){
		for(int i=0;i<=5;i++){
			if(frontIsClear()){
				move();
			}
		}
		if(!frontIsClear()){
			turnLeft();
		}else{
			turnOff();
		}
		
	}
	
}

