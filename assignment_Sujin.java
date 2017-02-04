package assignment_sujin;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class assignment_Sujin{
	
	public static void main(String[] args)
	{
		  String message1;
		  String message2;
		  String message3;
		  String message4;
		  String message5;
	        @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
	        List<String> Str_Arr=new ArrayList<String>();
	        System.out.println("input 5 lines of string");
	        System.out.println("first one");
	        message1 = scan.nextLine(); 
	        System.out.println("second one");
	        message2 = scan.nextLine(); 
	        System.out.println("third one");
	        message3 = scan.nextLine(); 
	        System.out.println("fourth one");
	        message4 = scan.nextLine(); 
	        System.out.println("fifth one");
	        message5 = scan.nextLine(); 
	        Str_Arr.add(message1);
	        Str_Arr.add(message2);
	        Str_Arr.add(message3);
	        Str_Arr.add(message4);
	        Str_Arr.add(message5);
	        Collections.sort(Str_Arr, new comp());
	        System.out.println(Str_Arr.get(4));

	}
}