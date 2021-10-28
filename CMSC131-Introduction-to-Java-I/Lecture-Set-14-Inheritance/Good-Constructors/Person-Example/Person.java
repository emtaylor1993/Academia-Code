package personExample;

public class Person {
	private String name;
	private int id;
	
	public Person() {
		name = "No Name";
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
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	public String toString() {
		return "name: " + name + ", ID: " + id;
	}
	
	public boolean equals(Object other) {
		System.out.println("in Person's NEW equals");

		if (other == null) {
			return false;
		} else if (other.getClass() != this.getClass()){
			return false;
		} else {
			Person p = (Person)other;
			return name.equals(p.getName()) && id == p.getID();
		}
	}
	public boolean equalsOld(Person p) {
		System.out.println("in Person's old equals");
		return name.equals(p.getName()) && id == p.getID();
	}
}



