package left_star_pattern;

public class H {
public static void main(String[] args) {
	for(int i=0;i<=4;i++) {
		for(int k=0;k<=i;k++) {
			System.out.print(" ");
		}
		for(int k=3;k>=i;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
