// This is a derived class already implemented for you

public class Student extends Person {
	private int numOfCredits;
	
	public Student () {
		super();
		numOfCredits = 12;
	}
	
	public Student (String name, int id, int credits) {
		super(name, id);
		numOfCredits = credits;
	}
	
	public int increaseLoad(int num) {
		numOfCredits += num;
		return numOfCredits;
	}
	
	public Student(Student s) {
		super(s);
		numOfCredits = s.numOfCredits;
	}
	
	public Student copyMe() {
		Student temp = new Student(this);
		return temp;
	}
	
	public int getLoad() {
		return numOfCredits;
	}
}
