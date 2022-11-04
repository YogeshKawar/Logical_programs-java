package CharacterCounting;

import java.util.Scanner;

public class CountChar {
public static void main(String[] args) {
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Characters: ");
	String old = sc1.nextLine();
	int totalCount =old.length();
	
	Scanner sc2= new Scanner(System.in);
	System.out.println("Enter char to count: ");
	String charToCount = sc2.nextLine();
	
	String afterRemovingChar = old.replace(charToCount, "");
	int revCount= afterRemovingChar.length();
	int count = totalCount-revCount;
	System.out.println("Total count of character "+charToCount+" -:"+count);
	sc1.close();
	sc2.close();
}
}
