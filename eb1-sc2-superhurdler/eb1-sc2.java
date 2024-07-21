package kareltherobot;

class HurdlerMain implements Directions
{	public static void main(String [] args)
	{	
		Hurdler2 h = new Hurdler2(1,1,North,0);
		
		
		while(true){
			h.clearHurdle();
		}
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/sc1.kwld");
		World.setDelay(5);
	}
	
}
