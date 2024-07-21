package kareltherobot;

class main implements Directions{
	public static void main(String[] args){
		
		beeperStack b = new beeperStack(5,5,North,0);
		
		b.evenOrOdd();
		b.turnOff();
		
	}
	
	static {
		World.setVisible(true);
		World.readWorld("C:/worlds/oe1.kwld");
		World.setDelay(2);
	}
}