package catExample;

public class CatOwner {
	private String name;
	private Cat pet;
	
	public CatOwner(String nameIn, Cat petIn) {
		pet = petIn;
		name = nameIn;
	}
	
	public CatOwner(CatOwner otherGuy) {
		name = otherGuy.name;
		pet = otherGuy.pet;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat("Fluffy");
		CatOwner a = new CatOwner("Fred", cat);
		CatOwner b = new CatOwner(a);
		System.out.println("a's pet = " + a.pet);
		System.out.println("b's pet = " + b.pet);
		System.out.println("a's pet is in danger!!");
		System.out.println("b's pet is safe (?)");
		a.pet.beEatenByADog();
		System.out.println("a's pet = " + a.pet);
		System.out.println("b's pet = " + b.pet);
		System.out.println("a's name = " + a.name);
		System.out.println("b's name = " + b.name);
		b.name = "George";
		System.out.println("a's name = " + a.name);
		System.out.println("b's name = " + b.name);
	}
}
