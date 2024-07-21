import TurtleGraphics.*;

public class InitialMain{
	public static void main(String[] args){
		SketchPadWindow window = new SketchPadWindow(800,800);
		Pen p = new StandardPen(window);		
		
		
		p.up();
		p.move(-200,-50);
		p.down();
		p.setDirection(0);
		p.move(50);
		p.setDirection(180);
		p.move(50);
		p.setDirection(90);
		p.move(50);
		p.setDirection(0);
		p.move(50);
		p.setDirection(180);
		p.move(50);
		p.setDirection(90);
		p.move(50);
		p.setDirection(0);
		p.move(50);

		p.up();
		p.move(50);
		p.setDirection(-90);
		p.down();
		p.move(100);
		p.setDirection(90);
		p.move(100);
		p.setDirection(0);
		p.move(50);
		p.setDirection(-90);
		p.move(50);
	    p.setDirection(180);
		p.move(50);
		p.setDirection(-45);
	    p.move(75);
	    
	    p.up();
	    p.setDirection(0);
	    p.move(50);
	    p.setDirection(90);
	    p.down();
	    p.move(100);
	    
	    p.setDirection(-26.565);
	    p.move(56);
	    p.setDirection(26.565+180);
	    p.move(56);
	    p.setDirection(-26.565);
	    p.move(56);
	    p.setDirection(26.565+180);
	    p.move(56);
	}
}