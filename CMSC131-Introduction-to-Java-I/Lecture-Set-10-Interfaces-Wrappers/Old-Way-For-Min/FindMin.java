package oldWayForMin;

public class FindMin {
	public static int findMin(int[] a) {
		int smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < smallest) {
				smallest = a[i];
			}
		}
		
		return smallest;
	}
	
	public static String findMin(String[] a) {
		String smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if  (a[i].compareTo(smallest) < 0) {
				smallest = a[i];
			}
		}
		
		return smallest;
	}	
	
	public static Cat findMin(Cat[] a) {
		Cat smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if  (a[i].compareTo(smallest) < 0) {
				smallest = a[i];
			}
		}
		
		return smallest;
	}
}
