import java.util.*;

public class StringOneMain{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		input = input.replace(" ", "*");
		System.out.println(input);
		input = input.substring(0,input.lastIndexOf("*") + 1) + "#!!@1234";
		System.out.println(input);
		input = input.substring(input.indexOf("*")+1, input.length());
		System.out.println(input);
		input = input.substring(input.indexOf("*")+1, input.length());
		System.out.println(input);
		input = input.substring(input.indexOf("*")+1, input.length());
		System.out.println(input);
		input += "EthanBittles";
		System.out.println(input);
		
		String reversed = "";
		for(int i=input.length();i>0;i--){
			reversed += input.substring(i-1,i);
		}
		System.out.println(reversed);
		System.out.println(reversed.length());
	}
}