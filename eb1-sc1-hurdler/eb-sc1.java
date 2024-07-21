package kareltherobot;

class HurdlerMain implements Directions
{	public static void main(String [] args)
	{	
		Hurdler1 h = new Hurdler1(1,1,East,0);
		
		for(int i=0;i<=8;i++){
			h.clearHurdle();
		}
	
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/worlds/sc3.kwld");
		World.setDelay(5);
	}
	
}
