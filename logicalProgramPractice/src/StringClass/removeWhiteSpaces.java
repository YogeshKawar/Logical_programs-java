package StringClass;

import java.util.Scanner;

public class removeWhiteSpaces {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String: ");
	String str = sc.nextLine();
	String trimmedStr = str.replaceAll("\\s", "");
	System.out.println(trimmedStr);
	sc.close();
}
}
