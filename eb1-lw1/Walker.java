package kareltherobot;

public class Walker extends Robot2{
	public Walker(int st, int av, Direction dir, int beep){
		super(st,av,dir,beep);
	}
	
	public void findNextBeeper(){
		while(true){
			if(BeeperInFront()){
				pickBeeper();
				break;
			}else if(BeeperOnLeft()){
				pickBeeper();
				break;
			}else if(BeeperOnRight()){
				pickBeeper();
				break;
			}
		}
		
	}
	
	void turnAround(){
		turnLeft();
		turnLeft();
	}
	
	public boolean BeeperInFront(){
		move();
		if(nextToABeeper()){
			return true;
		}else{
			turnAround();
			move();
			turnAround();
			return false;
		}
		
	}
	
	public boolean BeeperOnLeft(){
		turnLeft();
		move();
		if(nextToABeeper()){
			return true;
		}else{
			turnAround();
			move();
			turnLeft();
			return false;
		}
	}
	
	public boolean BeeperOnRight(){
		turnRight();
		move();
		if(nextToABeeper()){
			return true;
		}else{
			turnAround();
			move();
			turnRight();
			return false;
		}
	}
}