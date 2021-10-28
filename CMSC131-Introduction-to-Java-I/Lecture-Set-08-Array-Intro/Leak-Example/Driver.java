package leakExample;

public class Driver {
	public static void main (String[] args){
		CatLady first = new CatLady("Abigail", "Fluffy");
		CatLady second = new CatLady("Betty","Garfield");
		System.out.println("Each owner taking care of their own cat:");
		first.walkTheCat();
		second.walkTheCat();
		
		System.out.println("Taking care of the cats myself:");
		Cat cat1 = first.getCat();
		Cat cat2 = second.getCat();
		cat1.beEatenByADog();
		cat2.beEatenByADog();
		System.out.println("cats: " + cat1 + " " + cat2);
		System.out.println(first);
		System.out.println(second);	
		
		String n1 = cat1.getName();
		String n2 = cat2.getName();
		n1 += " Jan";
		n2 += " Jan";
		
		System.out.println("names: " + n1 + " " + n2);
		System.out.println("cats: " + cat1 + " " + cat2);
	}
}
