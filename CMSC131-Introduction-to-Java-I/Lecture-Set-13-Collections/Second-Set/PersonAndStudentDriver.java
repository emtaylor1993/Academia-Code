package secondSet;

import secondSet.Person;

public class PersonAndStudentDriver {
	public static void main(String[] args) {
		Person p = new Person("Fred", 27272);
		Student x = new Student("Joe", 272728, 1995, 7.0);
		
		System.out.println(p);
		System.out.println(x);
	}
}
