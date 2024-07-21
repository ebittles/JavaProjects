//package turtlegraphics;
import java.util.Scanner;
import java.awt.Color;
import TurtleGraphics.*;
 
public class TTriangle {
    public static void main(String [] args) {
        SketchPadWindow window = new SketchPadWindow(800,800);
        Pen pen = new StandardPen(window);
        Scanner reader = new Scanner(System.in);
 
        Triangle t = new Triangle(0, 0, 0, 100, 100, 0);
        //Triangle t = new Triangle(0, 0, 50, 86.603, 100, 0);
        //Triangle t = new Triangle(0, 0, 120, 50, 100, 0);
        
        t.draw(pen);
        System.out.print(t);
        reader.nextLine();
         
        pen.setColor(Color.white);
        t.draw(pen);
        t.move(100, 100);
        pen.setColor(Color.blue);
        t.draw(pen);
        System.out.print(t);
        reader.nextLine();
         
        pen.setColor(Color.white);
        t.draw(pen);
        t.stretchBy(2);
        pen.setColor(Color.blue);
        t.draw(pen);
        System.out.print(t);
         
        reader.nextLine();
    }
}