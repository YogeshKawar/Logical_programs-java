package Factorial;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no:");
	int num=sc.nextInt();
	int fact=1;
	
	for(int i=1;i<=num;i++) {
		fact=fact*i;	
	}
	System.out.println(fact);
	sc.close();
}
}
