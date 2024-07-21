package kareltherobot;

class MazeMain implements Directions {
	public static void main(String[] args){
		MazeWalker m = new MazeWalker(14,1,North,0);
		
		while(!m.nextToABeeper()){
			m.mazeWalk();
		}
		m.pickBeeper();
		m.turnOff();
		
	}
	
	static{
		World.setVisible(true);
		World.readWorld("C:/worlds/maze1.kwld");
		World.setDelay(2);
	}
}