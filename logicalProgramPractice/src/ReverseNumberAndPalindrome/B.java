package ReverseNumberAndPalindrome;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no: ");
	int num = sc.nextInt();
	int revNum=0;
	int rem;
	
	for(int i=num;i>0;i=i/10) {
		rem = i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(revNum);
	if(num==revNum) {
		System.out.println("No is Palindrome");
	}
	else {
		System.out.println("No is not Palindrome");
		sc.close();
		
	}
}
}
