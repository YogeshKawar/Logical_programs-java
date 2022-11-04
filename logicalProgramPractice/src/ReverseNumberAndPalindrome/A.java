package ReverseNumberAndPalindrome;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter No: ");
	int num=sc.nextInt();
	int revNum=0;
	int rem;
	
	for(int i=num;i>0;i=i/10) {
		rem=i%10;
		revNum=revNum*10+rem;
	}
	System.out.println(String.format("%04d", revNum));
	if(num==revNum) {
		System.out.println("Is Palindrome");
	}
	else {
		System.out.println("Is not Palindrome");
	}
	sc.close();
}
}
