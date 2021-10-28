package encapsulationExDrivers;

import encapsulationExamples.Cat;
import encapsulationExamples.CatOwner;

public class CatDriver4 {
	public static void main(String[] args) {
		Cat x = new Cat("Felix");
		Cat y = new Cat("Bob");
		
		CatOwner a = new CatOwner("Millie", x);
		CatOwner b = new CatOwner("Martha", y);
		CatOwner c = new CatOwner(a);
		
		a.walkPet();
		b.walkPet();
		c.walkPet();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}

