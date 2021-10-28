package secondSet;

import secondSet.Person;

public class Student extends Person {
	private int admitYear;
	private double gpa;
	
	public Student() {
		super();                  // super must be first line in constructor
		admitYear = 2000;
		gpa = 4.0;
	}
	
	public Student(String name, int id, int admitYear, double gpa) {
		super(name, id);
		this.admitYear = admitYear;
		this.gpa = gpa;
	}
	
	public Student(Student s) {
		super(s);
		admitYear = s.admitYear;
		gpa = s.gpa;
	}
	
	public int getAdmitYear() {
		return admitYear;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public String toString() {
		return super.toString() + ", Admitted: " + admitYear + ", gpa: " + gpa;
	}
	
	public boolean equals(Student s) {
		return super.equals(s) && admitYear == s.admitYear && gpa == s.gpa;
	}
}
