package specialCharAtEnd;

import java.util.Scanner;

public class concatSpecialCharAtEnd {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String input = sc.next();
	String regex = "[^0-9	\\s+]";
	String specChar="";
	String inputData="";
	
	for(int i=0;i<input.length();i++) {
		char ch = input.charAt(i);
		if(String.valueOf(ch).matches(regex)) {
			specChar = specChar + ch;
         } else {
            inputData = inputData + ch;
         }
      }
      System.out.println("Result: "+inputData+specChar);
      sc.close();
	}
}
