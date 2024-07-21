import java.util.*;

public class CalendarClass{
	private int[] daysOfMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int numDays, firstDay;
	private ArrayList<Integer> c;
	
	public CalendarClass(int m, int y){
		numDays = daysOfMonths[m-1];
		firstDay = dayOfWeek(1,m,y);
		if(((y%4==0&&y%100!=0)||y%400==0)&&m==2){
			numDays++;
		}
		c = new ArrayList<Integer>();
	}
	
	private int dayOfWeek(int d, int m, int y){
		int[] x = {0,3,4,5,0,3,5,1,4,6,2,4};
		if(m<3){
			y-=1;
		}
		return((y+y/4-y/100+y/400+x[m-1]+d)%7);
	}
	
	private void fill(){
		for(int i=0;i<firstDay;i++){
			c.add(0);
		}
		for(int i=1;i<numDays+1;i++){
			c.add(i);
		}
	}
	
	public String toString(){
		fill();
		String out = " Sun | Mon | Tue | Wed | Thu | Fri | Sat ";
		out += "\n+-----+-----+-----+-----+-----+-----+-----+";
		while(c.size()>0){
			out+="\n|";
			for(int i=0;i<7;i++){
				int day = 0;
				if(c.size()>0){
					day = c.get(0);
					c.remove(0);
				}
				if(day==0){
					out+="     |";
				}else if(day<10){
					out += "  " + day + "  |";
				}else{
					out += "  " + day + " |";
				}
			}
			out += "\n+-----+-----+-----+-----+-----+-----+-----+";
		}
		return out;
	}
}