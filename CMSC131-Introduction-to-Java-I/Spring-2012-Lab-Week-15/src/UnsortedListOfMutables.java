import java.util.ArrayList;

// Some is implemented for you and others you must implement

public class UnsortedListOfMutables {
	ArrayList<Person> universityList;

	public UnsortedListOfMutables() {
		universityList = new ArrayList<Person>();
	}
	
	public void addItem(Person newMember) {
		// Adds a new item to the end of the list
		// The new Item added must be in new space on the heap
		// it can not be a reference to the space used by newMember 
		// (the parameter passed in)
		 
		// Your Code Here
		Student student1 = new Student();
		Faculty faculty1 = new Faculty();
		Person adder;
		
		if (newMember.getClass() == student1.getClass()) {
			 adder = new Student((Student)newMember);
		} else if (newMember.getClass() == faculty1.getClass()) {
			 adder = new Faculty(newMember.getName(), newMember.getid(), ((Faculty)newMember).getValue());
		} else {
			 adder = new Person(newMember);
		}
		
		universityList.add(adder);
	}
	
	public double findTotalSalary() {
		// Returns the sum of all Faculty Salaries
		// Since persons and students do not have salaries,
		// those entries are ignored.

		// Your Code Here
		Faculty person = new Faculty();
		double value = 0.0;
		
		for (Person p : universityList) {
			if (p.getClass() == person.getClass()) {
				value = person.getValue();
			}
		}
		
		return value;
	}
	
	public double getAverageLoad() {
		// Returns the average of all student credit loads
		// Since persons and faculty do not have credit loads,
		// those entries are ignored.
		int count = 0;
		int sum = 0;
		Student f = new Student();
		
		for (Person p: universityList) {
			if (p.getClass().equals(f.getClass())) {
				Student stu = (Student)p;
				sum += stu.getLoad();
				count++;
			}
		}
		
		return (double)sum / count;
	}

	public String getNames() {
		if (universityList == null || universityList.size() == 0) {
			return null;
		} else {
			String list = "";
			for (Person p : universityList) {
				list += p.getName();
			}
			
			return list;
		}
	}
}
