package SIB_Pack;

public class SIB {
	int i=10;
	static {
		System.out.println("HIII..., Im from static block");
	}
	
	{
		System.out.println("Hiiiiiiii, Im from Instance Initializer Block");
	}
	
	SIB()
	{
		System.out.println("Im from constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hiiiiii, Im from main method");
		SIB s=new SIB();
		System.out.println("Value of i:" +s.i);
		
	}

}
