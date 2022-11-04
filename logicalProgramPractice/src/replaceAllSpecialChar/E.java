package replaceAllSpecialChar;

import java.util.Scanner;

public class E {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Name: ");
	String name= sc.next();
	String actName=name.replaceAll("[^a-zA_Z0-9]", "");
	System.out.print("Actual Name: "+actName);
	sc.close();
}
}
