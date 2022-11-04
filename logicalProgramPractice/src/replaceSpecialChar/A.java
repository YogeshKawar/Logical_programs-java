package replaceSpecialChar;

import java.util.Scanner;

public class A {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name: ");
	String name = sc.next();
	String actName=name.replace("@","");
	System.out.println("Actual Name: "+actName);
	sc.close();
}
}
