package constructorFirstProgram;

public class Kitchen {
public static void main(String[] args) {
	Dish d=new Dish("Pizza",6);
	d.menu();
	System.out.println("Pizza Served");
	
	Dish m = new Dish("Burger", 5);
	m.menu();
	System.out.println("Burger Served");
			
}
}
