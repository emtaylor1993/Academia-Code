package methodCallingSummary;

public class Cat {
	/**
	 * A class representing an animal that is a pet that is a cat.
	 * A cat does not live a happy life, but has several of them to use.
	 * To show some HTML:
	 * <pre>
	 * 	+++++    +   +++++
	 *  +       + +    +
	 *  +      +++++   +
	 *  +      +   +   +
	 *  +++++  +   +   +
	 * </pre>
	 *
	 * @version	2.3 14 March 2001
	 * @author  Fawzi Emad
	 * @author  Jan Plane
	**/
	private String name;   // each cat created has an individual
	private int lives;     // name and number of lives  
	
	/** Maximum number of lives any cat can have.
	 * Must be greater than or equal to 1.
	 **/
	public static int MAX_LIVES = 9;
	
	/**
	* Constructs a Cat with the name provided as the name
	* and the MAX_Lives as its current number of lives.
	*     
	* @param nameProvided to be newly constructed cat's name
	**/
	public Cat(String nameProvided) {
		name = nameProvided;
		lives = MAX_LIVES;
		System.out.println(name + " has been created!");
	}
	
	/**
	* Sets the current cat's name provided to the name passed
	* does not modify its current number of lives.
	*     
	* @param newName to be used as the existing cat's name
	**/	
	public void setName(String newName) {
		name = newName;
	}
	
	/**
	* Causes the current cat to be eaten by a dog 
	* and therefore one life is lost for that cat. 
	* Gives output of cat's name, current lives and life proportion.
	*     
	* @exception divideByZero exception thrown when number of lives is -1
	* 
	**/
	public void beEatenByADog() {
		lives--;
		System.out.println(name + " has been eaten!");
		System.out.println(name + " has " + lives + " more lives...");
		int lifePortion = MAX_LIVES / (lives + 1);
		System.out.println("life portion = " + lifePortion);
	}
	
	/**
	* Returns boolean to indicate if the current cat is dead or alive.
	*     
	* @return true for alive and false if not alive
	**/
	public boolean isAlive() {
		return lives > 0;
	}
	
	/**
	* Gives a string which is the current cat's name
	* followed by the first letter of the name
	* and the number of lives in parentheses
	* 
	* @exception null pointer exception thrown when cat's name is null
	* @return string of the name and number of lives
	**/
	public String toString() {
		return name + " (" + name.charAt(0) + lives + " lives)";
	}
	
	/**
	* Gives a string to tell about cats in general
	*     
	* @return String of information about cats
	**/
	public static String tellUsAboutCats() {
		String output = "Cats are furry little creatures.\n";
		output += "Some people believe that cats are magical ";
		output += "and possess universal wisdom.\nI think cats ";
		output += "are more like domestic squirrels.";
		return output;
	}
}
