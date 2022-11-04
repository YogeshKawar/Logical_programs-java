package Addition1to10;

import java.util.Scanner;

public class B {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no. to be add: ");
	int num = sc.nextInt();
	int sum=0;
	for(int i=0;i<=num;i++) {
		sum=sum+i;
	}
	System.out.println(sum);
	sc.close();
}
}
