public class TwelveDaysClass {
	
	public void day(int endDay){
		int day = endDay;
		
		switch(day){
			case 1:
				System.out.println("On the first day of Christmas, my true love gave to me:\n");
				break;
			case 2:
				System.out.println("On the second day of Christmas, my true love gave to me:\n");
				break;
			case 3:
				System.out.println("On the third day of Christmas, my true love gave to me:\n");
				break;
			case 4:
				System.out.println("On the fourth day of Christmas, my true love gave to me:\n");
				break;
			case 5:
				System.out.println("On the fith day of Christmas, my true love gave to me:\n");
				break;
			case 6:
				System.out.println("On the sixth day of Christmas, my true love gave to me:\n");
				break;
		}
		
		for(int x=day;x>0;x--){
			switch(x){
				case 1:
					System.out.println("	A partridge in a pear tree /n");
					break;
				case 2:
					System.out.println("	Two turtle Doves and");
					break;
				case 3:
					System.out.println("	Three French Hens");
					break;
				case 4:
					System.out.println("	Four Calling Birds");
					break;
				case 5:
					System.out.println("	Five Gold Rings");
					break;
				case 6:
					System.out.println("	Six Geese-a-Laying");
					break;
				
			}
		}
	}
	
	
}