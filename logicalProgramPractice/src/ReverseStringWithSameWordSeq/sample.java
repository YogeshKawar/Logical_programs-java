package ReverseStringWithSameWordSeq;

public class sample {
public static void main(String[] args) {
	String s[] = "I am from Thane".split(" ");
	
	String ans = "";
	
	for(int i = s.length-1;i>=0; i--)
	{
		ans += s[i]+" ";
	}
	System.out.println("Reversed String: ");
	System.out.println(ans.substring(0,ans.length()-1));
	
}
}
