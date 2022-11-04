package parameterizedConstructor;

public class helloInDiffLanguage {
public static void main(String[] args) {
	hello h = new hello("Spanish",5);
	h.Spanish();
	System.out.println("'Hello' in 1st language printed : Spanish");
	System.out.println("");
	
	hello h1 = new hello("French",5);
	h1.French();
	System.out.println("'Hello' in 2nd language printed : French");
	System.out.println("");
	
	hello h2 = new hello("Arabic", 5);
	h2.Arabic();
	System.out.println("'Hello' in 3rd language printed : Arabic");
	System.out.println("");
	
	hello h3 = new hello("Japanese",5);
	h3.Japanese();
	System.out.println("'Hello' in 4th language printed : Japanese");
	System.out.println("");
	
	hello h4 = new hello("Italian",5);
	h4.Italian();
	System.out.println("'Hello' in 5th language printed : Italian");
}
}
