// This is the derived class you must implement

public class Faculty extends Person{
	private double annualSalary;
	
	public Faculty() {
		super();
		annualSalary = 100;
	}
	
	public Faculty(String name, int id, double annualSalary) {
		super(name, id);
		this.annualSalary = annualSalary;
	}
	
	public double getValue() {
		return this.annualSalary;
	}
	
	public Faculty copyMe() {
		Faculty f = new Faculty(getName(), getid(), annualSalary);
		return f;
	}
	
	public String toString() {
		String value = "";
		value += this.getName() + "(" + this.getid() + ") $" + this.getValue();
		return value;
	}
	
	public double giveRaise(double amount) {
		this.annualSalary += amount;
		return amount;
	}
}
