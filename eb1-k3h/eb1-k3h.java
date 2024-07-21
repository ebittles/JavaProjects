package kareltherobot;


class KarelMain implements Directions
{	public static void main(String [] args)
	{	
		
		Hurdler h = new Hurdler(1, 1, East, 0);
		
		h.move();
		h.move3();
		h.turnLeft();
		h.move3();
		h.turnRight();
		h.move();
		
		h.turnRight();
		h.move3();
		h.turnLeft();
		h.move3();
		h.turnLeft();
		h.move3();
		h.turnRight();
		h.move();
		
		h.turnRight();
		h.move3();
		h.turnLeft();
		h.move3();
		h.turnLeft();
		h.move3();
		h.turnRight();
		h.move();
		h.turnRight();
		h.move3();
		h.turnLeft();
		h.move();
		h.turnOff();
	
	}

	static
	{	World.setVisible(true);
		World.readWorld("C:/JCreatorV3LE/MyProjects/KarelProject/worlds/k3h.kwld");
		World.setDelay(10);
	}
}