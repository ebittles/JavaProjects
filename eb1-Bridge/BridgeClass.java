import java.util.*;

public class BridgeClass{
	Map<Integer, String> deck = new HashMap<>();
	Map<Integer, String> Cards;
		
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	String[] cards = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
	
	List<Map<Integer,String>> hands = new ArrayList<Map<Integer,String>>();
	
	Map<Integer, String> hand1 = new HashMap<>();
	Map<Integer, String> hand2 = new HashMap<>();
	Map<Integer, String> hand3 = new HashMap<>();
	Map<Integer, String> hand4 = new HashMap<>();
	
	List keys;
	
	public BridgeClass(){
		
		for(int i=0;i<52;i++){
			deck.put(i, cards[i%13] + " of " + suits[i/13]);
			keys = new ArrayList(deck.keySet());

		}
	}
	
	public void newHand(){
		
		List<Map.Entry<Integer, String>> shuffledDeck = new ArrayList<>(deck.entrySet());
		Collections.shuffle(shuffledDeck);

		Cards = new LinkedHashMap<>();
		for (Map.Entry<Integer, String> c : shuffledDeck) {
		    Cards.put(c.getKey(), c.getValue());
		}

	}
	
	public static <T, U> void split(Map<T,U> map, Map<T,U>... array){
	    int i = 0;
	    for(Map.Entry<T, U> e : map.entrySet()){
	        array[i++% array.length].put(e.getKey(), e.getValue());
	    }
	}
	
	public String toString(){
		split(Cards, hand1, hand2, hand3, hand4);
		TreeMap<Integer, String> sorted1 = new TreeMap<>(hand1);
		TreeMap<Integer, String> sorted2 = new TreeMap<>(hand2);
		TreeMap<Integer, String> sorted3 = new TreeMap<>(hand3);
		TreeMap<Integer, String> sorted4 = new TreeMap<>(hand4);
		
		String out = "";
		
		out += "Hand 1: " + sorted1.values() + "\n";
		out += "Hand 2: " + sorted2.values() + "\n";
		out += "Hand 3: " + sorted3.values() + "\n";
		out += "Hand 4: " + sorted4.values() + "\n";
		
		return out;
		
	}
	
}