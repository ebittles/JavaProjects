public class ConcentrationClass{
	
	private final String[] PRIZES = {"  Apple  ", "  Ball  ", "  Chair  ", "  Doll  ", "  Cat  ",
									"  Dog  ", "  Plane  ", "  Toy  "};
	private String[] gameBoard;
	private String[] completed;
	
	public ConcentrationClass(){
		gameBoard = new String[16];
		for(int i=1; i<=gameBoard.length; i++){
			gameBoard[i-1] = "    " + i + "    ";
			if(i/10 != 0){
				gameBoard[i-1] = "    " + i + "   ";
			}
		}
		completed = new String[gameBoard.length];
		boolean[] selected = new boolean[16];
		
		for (String p: PRIZES){
			for(int i=0;i<2;i++){
				int t = (int)(Math.random()*gameBoard.length);
				while(selected[t]){
					t = (int) (Math.random()*gameBoard.length);
				}
				completed[t] = new String(p);
				selected[t] = true;
			}
		}
	}
	
	
	
	public boolean playing(){
		for(int i=0; i<gameBoard.length; i++){
			if(!gameBoard[i].equals(completed[i])){
				return true;
			}
		}
		return false;
	}
	
	
	
	public String activeGame(){
		return displayBoard(gameBoard);
	}
	
	
	private String displayBoard(String[] b){
		String s = "";
		for(int i = 0; i<4; i++){
			for(int y=0;y<4;y++){
				s += "|" + b[4*i+y];
			}
			s+="|\n";
		}
		
		return s;
	} 
	
	
	public String guess(int g){
		g--;
		String[] temp = new String[gameBoard.length];
		for(int i = 0; i<gameBoard.length; i++){
			temp[i] = gameBoard[i];
		}
		temp[g] = completed[g];
		return displayBoard(temp);
	}
	
	
	
	public String guess(int g1, int g2){
		g1--;
		g2--;
		String[] temp = new String[gameBoard.length];
		for(int i = 0; i<gameBoard.length; i++){
			temp[i] = gameBoard[i];
		}
		temp[g1] = completed[g1];
		temp[g2] = completed[g2];
		if(temp[g1].equals(temp[g2])){
			gameBoard = temp;
		}
		return displayBoard(temp);
	}
}