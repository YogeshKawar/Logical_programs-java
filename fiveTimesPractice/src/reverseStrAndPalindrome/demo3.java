package reverseStrAndPalindrome;
import java.util.Scanner;//The Scanner class is used to get user input, and it is found in the java.util package.

public class demo3 {
public static void main(String[] args) {
	
	Scanner newObj = new Scanner(System.in);//creating object for scanner class
	System.out.println("Enter String and press enter: ");
	String str1 = newObj.nextLine();//passes entered argument to next line
	
	String str2 = "";
	
	for(int i=str1.length()-1;i>=0;i--) 
	{
		str2 = str2+str1.charAt(i);
	}
	System.out.println(str2);
	if(str1.equals(str2)) 
	{
		System.out.println("Is palindrome");
	}
	else
	{
		System.out.println("Is not palindrome");
	}
	newObj.close();
}
}
