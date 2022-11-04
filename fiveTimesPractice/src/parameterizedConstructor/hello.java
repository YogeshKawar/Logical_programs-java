package parameterizedConstructor;

public class hello {
String language;
int noOfTimes;
public hello(String language, int noOfTimes) {
	this.language = language;
	this.noOfTimes = noOfTimes;
}
public  void Spanish() {
	for(int i=1; i<=noOfTimes; i++)
		System.out.println("hola");
}
public void French() {
	for(int i=1; i<=noOfTimes; i++)
		System.out.println("bonjour");
}
public void Arabic() {
	for(int i=1; i<=noOfTimes; i++)
		System.out.println("asalaam alaikum");
}
public void Japanese() {
	for(int i=1; i<=noOfTimes; i++)
		System.out.println("konnichiwa");
}
public void Italian() {
	for(int i=1; i<=noOfTimes; i++)
		System.out.println("salve");
}

}
