package ReverseStringWithSameWordSeq;

import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.nextLine();
	String s[]=str.split(" ");
	
	String ans =" ";
	
	for(int i = s.length-1; i>=0; i--) {
		ans +=s[i]+" ";
	}
	System.err.println(ans.substring(0,ans.length()-1));
	sc.close();
}
}
