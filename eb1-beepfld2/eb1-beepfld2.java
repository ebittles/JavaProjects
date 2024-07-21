package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		Harvester h1 = new Harvester(2,3,East,0);
		Harvester h2 = new Harvester(4,3,East,0);
		Harvester h3 = new Harvester(6,3,East,0);
		
		h1.move();
		h1.harvest2rows();
		
		h2.move();
		h2.harvest2rows();
		
		h3.move();
		h3.harvest2rows();
		
		h1.turnOff();
		h2.turnOff();
		h3.turnOff();

	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/worlds/beepfld.kwld");
		World.setDelay(10);
	}
}