package catCommentingJavaDoc;

public class CatDriver {
	public static void main(String[] args) {
		Cat a = new Cat("Fluffy");
		System.out.println(Cat.tellUsAboutCats());
		System.out.println("A cat can have at most " + Cat.MAX_LIVES + " lives.");
		a.beEatenByADog();
	}
}
