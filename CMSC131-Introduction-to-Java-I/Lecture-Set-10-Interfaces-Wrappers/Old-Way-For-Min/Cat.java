package oldWayForMin;

public class Cat implements Comparable { 
	private int size;
	
	public Cat(int size) {
		this.size = size;
	}
	
	public int compareTo (Object x) {
		Cat y = (Cat)x;
		
		if (size == y.size) {
			return 0;
		}
		
		if (size < y.size) {
			return -1;
		}
		
		return 1;
	}
}
