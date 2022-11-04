package constructorFirstProgram;
public class fibonacciSeries {
int num1;
int num2;
int count;
int sum;
public void series(){
for(int i =1; i<=count; i++)
{
	sum = num1+num2;
	num1= num2;
	num2= sum;
	System.out.println(num1+"");
}
}
}
