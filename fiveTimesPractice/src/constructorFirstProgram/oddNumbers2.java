package constructorFirstProgram;

public class oddNumbers2 {
	public static void main(String[] args) {
		oddNumbers odd = new oddNumbers();
		odd.programName = "Odd Numbers";
		odd.searchNum = 10;
		odd.numbers();
		System.out.println("1 to 10 Odd Numbers printed");
	}
}
