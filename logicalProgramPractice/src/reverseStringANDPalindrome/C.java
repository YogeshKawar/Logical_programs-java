package reverseStringANDPalindrome;

import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.next();
		String str2="";

		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		if(str1.equals(str2)) {
			System.out.println("Is Palindrome");
		}
		else {
			System.out.println("Is not Palindrome");
		}
		sc.close();
	}
}
