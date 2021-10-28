package leakExample;

public class CatLady {
	private String name;
	private Cat pet;
	
	public CatLady(String name, String nameOfCat) {
		this.name = name;
		pet = new Cat(nameOfCat);
	}
	
	public CatLady(CatLady otherLady) {
		name = otherLady.name;
		pet = new Cat(otherLady.pet);
	}
	
	public Cat getCat() {
		return new Cat(pet);
	}
	
	public void walkTheCat() {
		if (name.charAt(0) == 'A') {
			System.out.println("--" + name + "'s cat Is Safe");
		} else {
			System.out.println("--" + name + "'s cat is NOT SAFE");
			pet.beEatenByADog();
		}
	}
	
	public String toString(){
		return name + " and her cat " + pet;
	}
}
