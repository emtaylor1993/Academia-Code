// This is the base - already implemented for you

public class Person {
	private String name;
	private int id;

	public Person() {
		name = "None Given";
		id = 0;
	}
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public Person(Person p) {
		name = p.name;
		id = p.id;
	}
	
	public Person copyMe() {
		Person tempPerson = new Person(this);
		return tempPerson;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getid() {
		return this.id;
	}
	
	public String toString() {
		return (name + "(" + id + ")");
	}
}
