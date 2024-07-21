public class FrameArtClass {
	final public double GLASSCOST=.02, FRAMECOST=1.45;
	private double length,width;
	
	public FrameArtClass(double len, double wid){
		length = len;
		width = wid;
	}
	public double findArea(){
		return length*width;
	}
	public double glassPrice(){
		return findArea()*GLASSCOST;
	}
	public double findPerimeter(){
		return 2*(length+width);
	}
	public double framePrice(){
		return findPerimeter()*FRAMECOST/12;
	}
	public double totalPrice(){
		return glassPrice() + framePrice();
	}
}