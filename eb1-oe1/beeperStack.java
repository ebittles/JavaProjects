package kareltherobot;

public class beeperStack extends Robot2{
	
	int a=0;
	
	public beeperStack(int st, int av, Direction dir, int numBeep){
		super(st,av,dir,numBeep);
	}
	
	
	public void evenOrOdd(){
		while(nextToABeeper()){
			pickBeeper();
			a++;
		}
		if(a%2==0){
			turnRight();
		}else{
			turnLeft();
		}
		move();
		while(nextToABeeper()){
			pickBeeper();
		}
	}
}