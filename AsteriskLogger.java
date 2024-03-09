package Week5Project;

 class AsteriskLogger implements Logger{
		
		      
	@Override
	public void log(String newString) {
		System.out.println("***" + newString + "***");
		
	}
	@Override
	public void error(String newString) {
		System.out.println("******************" +
                "\n***Error: " + newString + "***" +
		           "\n******************");
		
	}

}
