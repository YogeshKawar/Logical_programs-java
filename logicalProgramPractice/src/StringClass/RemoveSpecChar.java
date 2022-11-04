package StringClass;

import java.util.Scanner;

public class RemoveSpecChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.next();
	String plainStr = str.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(plainStr);
	sc.close();
}
}
