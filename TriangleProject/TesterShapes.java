// Example 11.3: Try out some shapes

import TurtleGraphics.*;
import java.awt.Color;
import java.util.Scanner;

public class TesterShapes{
   public static void main(String[] args){

      // Declare and instantiate a pen and a rectangle
      SketchPadWindow window = new SketchPadWindow(800,800);
      Pen pen = new StandardPen(window);
      Scanner reader = new Scanner(System.in);
      
      
      Shape s2 = new Rect (-40, -40, 40, 20);
      
      // Draw the rectangle 
      s2.draw(pen);
      
      // Display a description of the rectangle
      System.out.println(s2);  // toString method called implicitly
      
      // Pause until the user is ready to continue
      reader.nextLine();

      // Erase the rectangle
      pen.setColor(Color.white);
      s2.draw(pen);
      pen.setColor(Color.red);
      
      // Move the rectangle, change their size, and redraw          
      s2.move(-30, -30);
                 
      s2.stretchBy(2);
                    
      s2.draw(pen);
      
      System.out.println(s2);
      
      reader.nextLine();
   }
}
