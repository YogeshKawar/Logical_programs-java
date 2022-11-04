package countWhiteSpaces;

import java.util.Scanner;

public class C {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Name: ");
	String str = sc.nextLine();
	int count =0;
	for(int i =0;i<=str.length()-1;i++) {
		char ch= str.charAt(i);
		if(ch==' ') {
			count++;
		}
	}
	System.out.println("Whitespaces are in name :" +count+"\nRemove Whitespaces:"+str.replaceAll(" ",""));
	sc.close();
}
}
