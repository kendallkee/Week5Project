package Week5Project;

public class App {

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		aLogger.log("Welcome");
		aLogger.error("ABORT");
		
		Logger eLogger = new SpacedLogger();
		eLogger.log("Java is different");
		eLogger.error("DON't DO IT!");

	}

}
