package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		
		ur_Robot karel = new ur_Robot(1, 1, East, 0);
		
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.turnLeft();
		karel.turnLeft();
		karel.turnLeft();
		karel.move();
		karel.move();
		karel.move();
		karel.turnOff();
	
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/k1h.kwld");
	}
}