package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		Harvester sh = new SuperHarvester(2,3,East,0);
		
		sh.move();
		sh.harvest2rows();
		sh.harvest2rows();
		sh.harvest2rows();
		sh.turnOff();
		
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/worlds/beep2.kwld");
		World.setDelay(10);
	}
}