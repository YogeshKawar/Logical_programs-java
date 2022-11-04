package constructorFirstProgram;
public class fibonacciSeries2 {
public static void main(String[] args) {
	fibonacciSeries s = new fibonacciSeries();
	s.num1=0;
	s.num2=1;
	s.count=10;
	s.series();
	System.out.println("Fibonacci Series Printed");
}
}
