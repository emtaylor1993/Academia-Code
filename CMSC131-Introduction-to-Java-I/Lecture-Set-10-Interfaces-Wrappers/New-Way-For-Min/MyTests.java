package newWayForMin;

import junit.framework.TestCase;

public class MyTests extends TestCase {

	public void testIntegers() {
		Integer[] a = {5, -1, 23};
		assertTrue(FindMin.findMin(a) == a[1]);
	}
	
	public void testStrings() {
		String[] a = {"cat", "pig", "aardvark", "dog"};
		assertTrue(FindMin.findMin(a) == a[2]);
	}
	
	public void testCats() {
		Cat[] a ={new Cat(7), new Cat(77), new Cat(5), new Cat(2), 
				new Cat(33)};
		assertTrue(FindMin.findMin(a) == a[3]);
	}
	
}
