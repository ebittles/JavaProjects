package kareltherobot;

public class MazeWalker extends Robot2{
	public MazeWalker(int st, int av, Direction dir, int beep){
		super(st, av, dir, beep);
	}

	
	public void mazeWalk(){
		while(frontIsClear()&&!rightIsClear()){
			move();
		}
		if(rightIsClear()){
			turnRight();
			if(frontIsClear()){
				move();
			}
		}else{
			turnLeft();
			if(frontIsClear()){
				move();
			}
		}
	}
}