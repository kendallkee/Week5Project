package Week5Project;

 class SpacedLogger implements Logger{

	@Override
	public void log(String newString) {
		StringBuilder spacedString = new StringBuilder();
		for (int i = 0; i < newString.length(); i++) {
			spacedString.append(newString.charAt(i)).append(" ");
		}
		System.out.println(spacedString.toString());
	}

	@Override
	public void error(String newString) {
		StringBuilder errorString = new StringBuilder();
		for (int i = 0; i < newString.length(); i++) {
			errorString.append(newString.charAt(i)).append(" ");
		}
		System.out.println("ERROR: " + errorString.toString());
	}
	 

}
