package countWhiteSpaces;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		int count=0;
		
		for(int i=0;i<=name.length()-1;i++) {
			char ch = name.charAt(i);
			if(ch==' ') {
				count++;
			}
		}

		System.out.println("Whitespaces are in name: "+count+"\nRemove WhiteSpaces: "+name.replaceAll(" ", ""));
		sc.close();
	}
}