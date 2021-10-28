package personExample;

public class Student extends Person {
	private int admitYear;
	private double gpa;

	public Student() {
		super();                  // Super must be first line in constructor
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
		return "S:"+super.toString() + ", Admitted: " + admitYear + ", gpa: " + gpa;
	}

	public boolean equals(Object other) {
		System.out.println("in Student's NEW equals");

		if (other == null) {
			return false;
		} else if (other.getClass() != getClass()){
			return false;
		} else {
			Student s = (Student)other;
			return super.equals(s) && admitYear == s.admitYear && gpa == s.gpa;
		}
	}
	
	public boolean equalsOld(Student s) {
		System.out.println("in Student's old equals");

		return super.equalsOld(s) && admitYear == s.admitYear && gpa == s.gpa;
	}
}
