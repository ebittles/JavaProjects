package kareltherobot;

class HurdlerMain implements Directions
{	public static void main(String [] args)
	{	
		Hurdler3 h = new Hurdler3(1,1,East,0);
		
		while(h.frontIsClear()){
			h.move();
		}
		
		h.turnLeft();
		while(true){
			h.clearHurdle();
		}
		
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/sd2.kwld");
		World.setDelay(5);
	}
	
}
