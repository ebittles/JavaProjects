package kareltherobot;

class lw_Main implements Directions{
	public static void main(String[] args){
		
		Walker w = new Walker(2,3, North, 0);
		
		while(true){
			if(!w.nextToABeeper()){
				w.findNextBeeper();
			}else{
				w.pickBeeper();
				w.turnOff();
				break;
			}
		}
	}
	
	static {
		World.setVisible(true);
		World.readWorld("C:/worlds/lw1.kwld");
		World.setDelay(2);
	}
}