package kareltherobot;

public class boxRobot extends Robot2{
	public boxRobot(int st, int av, Direction dir, int beep){
		super(st,av,dir,beep);
	}
	
	public void findCorner(){
		while(!facingWest()){
			turnLeft();
		}
		
		while(frontIsClear()){
			move();
		}
		turnLeft();
		while(frontIsClear()){
			move();
		}
		turnLeft();
		
	}
	
	
	
	void repoRight(){
		turnLeft();
		if(nextToABeeper()){
			pickBeeper();
			turnOff();
		}else{
			move();
			turnLeft();
		}

	}
	
	void repoLeft(){
		turnRight();
		if(nextToABeeper()){
			pickBeeper();
			turnOff();
		}else{
			move();
			turnRight();
		}
	}
	
	public void sweep(){
		while(frontIsClear()){
			if(!nextToABeeper()){
				move();
			}else{
				pickBeeper();
				turnOff();
			}

		}
	}
	
	public void sweepTwoRows(){
		sweep();
		repoRight();
		sweep();
		repoLeft();
		
	}
	
	
}