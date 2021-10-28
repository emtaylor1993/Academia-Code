package newWayForMin;

public class FindMin {

	public static Comparable findMin(Comparable[] a) {
		Comparable smallest = a[0];
		for (int i = 1; i < a.length; i++) {
			if  (a[i].compareTo(smallest) < 0) {
				smallest = a[i];
			}
		}
		return smallest;
	}
}
