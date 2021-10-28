package firstWay;

public class PsychMajor {
	public String name;
	
	public PsychMajor (String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void psychoAnalyze(CSMajor student) {
		System.out.println(name + " says:  " + student.getName() + " needs some help.");
		System.out.println("OK, " + student.getName() +", what is 2 + 2?");
		student.add(2, 2);
		System.out.println(name + " says:  " + student.getName() + ", you are crazy.");
	}
	
	public void psychoAnalyze(CEMajor student) {
		System.out.println(name + " says:  " + student.getName() + " needs some help.");
		System.out.println("OK, " + student.name +", what is 2 + 2?");
		student.add(2, 2);
		System.out.println(name + " says:  " + student.getName() + ", you are crazy.");
	}
	
	public void psychoAnalyze(PsychMajor student) {
		System.out.println(name + " says:  " + student.getName() + " needs some help.");
		System.out.println("OK, " + student.name +", what is 2 + 2?");
		student.add(2, 2);
		System.out.println(name + " says:  " + student.getName() + ", you are crazy.");
	}
	
	public void goToClass() {
		System.out.println(name + " says: Going to class makes me depressed, so I'll ");
		System.out.println("stay home and talk with my roommate about his CS classes.");
		CSMajor roommate = new CSMajor("roommate");
		psychoAnalyze(roommate);
	}

	public void study() {
		System.out.println(name + " thinks:  What can I learn about MYSELF today?");
		psychoAnalyze(this);
	}

	public void add(int a, int b) {
		System.out.println(name + " says:  Let's talk about how adding numbers makes us feel.");
	}
}
