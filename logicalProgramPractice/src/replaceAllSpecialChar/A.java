package replaceAllSpecialChar;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name :");
	String name = sc.next();
	String actName=name.replaceAll("[^a-zA-Z0-9]", "");
	System.out.print("Actual Name: "+actName);
	sc.close();
}
}
