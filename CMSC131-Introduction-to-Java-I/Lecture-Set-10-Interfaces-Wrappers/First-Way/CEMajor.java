package firstWay;

public class CEMajor {
	public String name;
	
	public CEMajor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void goToClass() {
		System.out.println(name + " says:  CSIC or Glenn L. Martin?  Too hard to decide... I'll sleep in...");
	}

	public void study() {
		System.out.println(name + " says:  ...too many derivatives.  What's in the fridge?");
	}

	public void add(int a, int b) {
		System.out.println(name + " says:  " + a + " plus " + b + "... Sorry, I didn't bring my calculator today.");
	}
}
