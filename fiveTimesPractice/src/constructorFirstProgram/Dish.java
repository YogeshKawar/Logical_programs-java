package constructorFirstProgram;

public class Dish {
String dishName;
int noOfDishes;

public Dish(String dishName, int noOfDishes) {
	this.dishName = dishName;
	this.noOfDishes = noOfDishes;
}
public void menu() {
	for(int i=1;i<=noOfDishes;i++) {
		System.out.println("Prepared");
	}
}

}
