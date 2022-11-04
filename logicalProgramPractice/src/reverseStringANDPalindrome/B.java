package reverseStringANDPalindrome;

import java.util.Scanner;

public class B {
	public static void main(String[] args) {
		String str2="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str1 = sc.next();

		for(int i=str1.length()-1;i>=0;i--) {
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("Is palindrome");
		}
		else {
			System.out.println("Is not palindrome");
		}
		sc.close();
	}
}
