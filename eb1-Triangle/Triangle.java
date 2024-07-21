import TurtleGraphics.Pen;

public class Triangle implements Shape {

   private double x1,y1,x2,y2,x3,y3;

   public Triangle() {
      x1 = 0;
      y1 = 0;
      x2 = 0;
      y2 = 0;
      x3 = 0;
      y3 = 0;
   }

   public Triangle(double xOne, double yOne, double xTwo, double yTwo, double xThree, double yThree) {
      x1 = xOne;
      y1 = yOne;
      x2 = xTwo;
      y2 = yTwo;
      x3 = xThree;
      y3 = yThree;
   }
 
   public double area() {
      return Math.abs(.5*((x1*(y2-y3))+(x2*(y3-y1))+(x3*(y1-y2))));
   }

   public void draw (Pen p) {
      p.up();
      p.move (x1, y1);
      p.down();
      p.move(x2,y2);
      p.move(x3,y3);
      p.move (x1, y1);
   }

   public double getXPos() {
      return x1;
   }

   public double getYPos() {
      return y1;
   }

   public void move (double xLoc, double yLoc) {
      x1 += xLoc;
      y1 += xLoc;
      x2 += xLoc;
      y2 += xLoc;
      x3 += xLoc;
      y3 += xLoc;
   }

   public void stretchBy (double factor) {
      x2 = x1 + (x2-x1)*factor;
      y2 = y1 + (y2-y1)*factor;
      x3 = x1 + (x3-x1)*factor;
      y3 = y1 + (y3-y1)*factor;
   }

   public String toString() {
      String str = "TRIANGLE\n"
                 + "(X1, Y1): (" + x1 + ", " + y1 +")\n"
                 + "(X2, Y2): (" + x2 + ", " + y2 +")\n" 
                 + "(X3, Y3): (" + x3 + ", " + y3 +")\n"
                 + "Area: " + area();
      return str;
   }
}

