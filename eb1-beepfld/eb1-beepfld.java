package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		Harvest h = new Harvest(2,3,East,0);
		
		h.move();
		h.harvest2rows();
		h.harvest2rows();
		h.harvest2rows();
		h.turnOff();
		
	
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/beepfld.kwld");
		World.setDelay(10);
	}
}