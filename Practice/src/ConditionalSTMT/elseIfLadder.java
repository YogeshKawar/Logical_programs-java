package ConditionalSTMT;

public class elseIfLadder {
public static void main(String[] args) {
	int marks = 80;
	if(marks>=75) {
	System.out.println("Pass! first class with distinction");
	}
	else if(marks>=65) {
	System.out.println("Pass with first class");
	}
	else if(marks>=50) {
		System.out.println("Pass with second class");
	}
	else if(marks>=35) {
		System.out.println("Pass");
	}
	else{
		System.out.println("Fail");
	}
	}
}
