import java.util.Scanner;
public class RunAnimal {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		
		System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
		String choose = SC.nextLine();
		
		if (choose.equalsIgnoreCase("B")){
			Animal b = new Bird();
			b.eat();
			b.sleep();
			b.makeSound();
		} else if (choose.equalsIgnoreCase("C")) {
			Animal c = new Cat();
			c.eat();
			c.sleep();
			c.makeSound();
		} else if (choose.equalsIgnoreCase("D")) {
			Animal d = new Dog();
			d.eat();
			d.sleep();
			d.makeSound();
		}
	}
}