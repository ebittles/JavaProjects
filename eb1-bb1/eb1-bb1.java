package kareltherobot;

class BoxMain implements Directions {
	public static void main(String[] args){
	
		boxRobot b = new boxRobot(5,3,West,0);
		
		b.findCorner();
		
		while(true){
			b.sweepTwoRows();
		}
		
	
	}
	
	static {	
		World.setVisible(true);
		World.readWorld("C:/worlds/bb1.kwld");
		World.setDelay(5);
	}
}