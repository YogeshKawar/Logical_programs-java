package elseIfLadder;

public class elseIfLadder3 {
public static void main(String[] args) {
	int age= 92;
    
    if (age < 10){
        System.out.println("Kid");
    }
     
    else if (age >= 13 && age < 20){
        System.out.println("Teenager");
    }

    else if (age >= 25 && age < 50){
        System.out.println("Adult");
    }
     
    else if (age >= 50 && age < 100){
        System.out.println("Old age");
    }
     
    else {
        System.out.println("Uncategorized");
}
}
}
