import java.util.Random;

public class PennyClass{
		
	 private String	puzzle = "PUZZLE"; 
	 private String	poster = "POSTER";
	 private String	game = "GAME";
	 private String	ball = "BALL";
	 private String	doll = "DOLL";
	 private String	hit = "X";
	 private String	blank = "-";	
	
	 private String board[] = {puzzle, blank, poster, blank, doll,
						  		blank, poster, blank, doll, ball,
						  		blank, puzzle, game, blank, blank,
						  		puzzle, ball, blank, poster, game,
						  		doll, game, blank, blank, ball};
	 
	 private int[] hits = new int[10];
	 Random gen = new Random();
	 private boolean Puzzle, Poster, Game, Ball, Doll;
	
	public String genBoard() 
	{
		String newBoard ="";
		for(int i = 0; i<25; i ++)
		{
			newBoard += board[i] + "\t";
			if((i+1)%5 ==0)
			{
				newBoard += "\n";
			}
		}
		return newBoard;
	}
	
	public void play()
	{
		int i = 0;
		while(i<10)
		{
			int j = gen.nextInt(25);
			hits[i] = j;
			if(board[j] != hit)
			{
				board[j] = hit; i++;
			}
		}
	}
		
	private void prizes()
	{
		int[] count = new int[5];
		for(int i = 0; i<10; i++)
		{
			if(hits[i] == 0||hits[i] == 11||hits[i] == 15)
				count[0] ++; 
			if(hits[i] == 2||hits[i] == 6||hits[i] == 18)
				count[1] ++; 
			if(hits[i] == 12||hits[i] == 19||hits[i] == 21)
				count[2] ++;
			if(hits[i] == 9||hits[i] == 16||hits[i] == 24)
				count[3] ++; 
			if(hits[i] == 4||hits[i] == 8||hits[i] == 20)
				count[4] ++; 
		}
		if(count[0]==3)
			Puzzle = true;
		if(count[1]==3)
			Poster = true;
		if(count[2]==3)
			Game = true;
		if(count[3]==3)
			Ball = true;
		if(count[4]==3)
			Doll = true;
	}
	
	public String toString(){
		prizes();
		String result = "";
		if(!Puzzle&&!Poster&&!Game&&!Ball&&!Doll)
			result += "Sorry you lost";
		else
		{
			result += "You won: ";
			if(Puzzle)
				result += "a Puzzle ";
			if(Poster)
				result += "a Poster ";
			if(Game)
				result += "a Game ";
			if(Ball)
				result += "a Ball ";
			if(Doll)
				result += "a Doll ";
		}
		return result;
		
	}
	
	
	
}
