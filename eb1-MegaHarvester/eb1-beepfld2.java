package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		MegaHarvester mh = new MegaHarvester(2,3,East,0);
		
		mh.move();
		mh.harvest2rows();
		mh.harvest2rows();
		mh.harvest2rows();
		mh.turnOff();
		

	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/beepfld2.kwld");
		World.setDelay(5);
	}
}