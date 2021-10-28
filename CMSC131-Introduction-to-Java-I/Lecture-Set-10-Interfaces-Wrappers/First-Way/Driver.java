package firstWay;

public class Driver {
	public static void dailyRoutine(CSMajor student) {
		student.goToClass();
		student.add(2, 2);
		student.study();
		System.out.println();
	}
	
	public static void dailyRoutine(CEMajor student) {
		student.goToClass();
		student.add(2, 2);
		student.study();
		System.out.println();
	}
	
	public static void dailyRoutine(PsychMajor student) {
		student.goToClass();
		student.add(2, 2);
		student.study();
		System.out.println();
	}
	
	public static void main(String[] args) {
		CSMajor csMajor = new CSMajor("John");
		CEMajor ceMajor = new CEMajor("Tom");
		PsychMajor psychMajor = new PsychMajor("Mark");
		dailyRoutine(csMajor);
		dailyRoutine(ceMajor);
		dailyRoutine(psychMajor);
		System.out.println("------------------");
		psychMajor.psychoAnalyze(csMajor);
		System.out.println("------------------");
		psychMajor.psychoAnalyze(ceMajor);
		System.out.println("------------------");
		psychMajor.psychoAnalyze(psychMajor);
	}
}
