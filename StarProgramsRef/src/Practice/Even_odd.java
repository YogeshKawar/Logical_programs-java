package Practice;

import java.util.Scanner;

public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number you want to check= ");
		num= s.nextInt();
		
		if (num%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		
s.close();
	}

}
