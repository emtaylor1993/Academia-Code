package DerivedStuff;

import BaseStuff.BaseType;

public class DerivedType extends BaseType {
	private double age;

	public DerivedType() {
		super();
		age = -1;
	}
	
	public DerivedType(String name, int size, double age) {
		super(name,size);
		this.age = age;
	}
	
	public DerivedType(DerivedType oldOne) {
		super(oldOne);
		this.age = oldOne.age;
	}
	
	public boolean grow(int amt) {
		if (super.grow(amt)) {
			age++;
			return true;
		} else{
			return false;
		}
	}
	
	public String toString() {
		return super.toString() + "[" + age + "]";
	}
}
