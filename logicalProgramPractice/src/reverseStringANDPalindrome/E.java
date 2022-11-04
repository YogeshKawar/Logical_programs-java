package reverseStringANDPalindrome;

import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1= sc.next();
		String str2="";

		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.err.println("Is Palnidrome");
		}
		else {
			System.out.println("Is not Palindrome");
		}
		sc.close();
	}
}
