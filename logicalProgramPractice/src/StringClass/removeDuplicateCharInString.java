package StringClass;

import java.util.Scanner;

public class removeDuplicateCharInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		//Approch-1 (Using Java 8) 
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		//Approch-2(Using indexOf(..)) 
		StringBuilder sb2 = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch,i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		sc.close();
	}
}
