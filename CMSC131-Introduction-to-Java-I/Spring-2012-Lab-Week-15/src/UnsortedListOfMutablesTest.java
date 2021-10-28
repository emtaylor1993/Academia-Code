import junit.framework.TestCase;

// The tests are done for the methods I implemented
// but you must add tests (or more lines to my tests)
// for the methods you implement

public class UnsortedListOfMutablesTest extends TestCase {
	public void testAddPerson() {
		UnsortedListOfMutables list = new UnsortedListOfMutables();
		assertTrue(list.getNames() == null);
		Person p = new Person("Pete", 1000);
		list.addItem(p);
		assertTrue(list.getNames().equals("Pete"));
	}	
	
	public void testAddStudent() {
		UnsortedListOfMutables list = new UnsortedListOfMutables();
		assertTrue(list.getNames() == null);
		Student s = new Student("Pete", 1000,10);
		list.addItem(s);
		assertTrue(list.getNames().equals("Pete"));
		assertTrue(list.getAverageLoad() > 9 && list.getAverageLoad() < 11);
	}
	
	public void testAddFaculty() {

	}
	
	public void emptyListTest() {
		UnsortedListOfMutables list = new UnsortedListOfMutables();
		assertTrue(list.getNames() == null);
		assertTrue(list.getAverageLoad() > -1 && list.getAverageLoad() < 1);
	}
	
	public void testAddAll() {
		UnsortedListOfMutables list = new UnsortedListOfMutables();
		assertTrue(list.getNames() == null);
		Student s = new Student("Pete", 1000,10);
		list.addItem(s);
		Person p = new Person("Fred", 100);
		list.addItem(p);
		assertTrue(list.getNames().equals("PeteFred"));
		assertTrue(list.getAverageLoad() > 9 && list.getAverageLoad() < 11);
		s.increaseLoad(3);
		assertTrue(list.getNames().equals("PeteFred"));
		assertTrue(list.getAverageLoad() > 12 && list.getAverageLoad() < 14);
	}
}
