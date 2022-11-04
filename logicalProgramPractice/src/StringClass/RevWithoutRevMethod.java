package StringClass;

import java.util.Scanner;

public class RevWithoutRevMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse: ");
		String str = sc.next();

		//approach=-1
		char[] chArr = str.toCharArray();
		for(int i=chArr.length-1;i>=0;i--) {
			System.out.print(chArr[i]);
		}
		System.out.println("");
		//approach=-2
		for(int i= str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		//approach=-3
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		sc.close();
	}
}