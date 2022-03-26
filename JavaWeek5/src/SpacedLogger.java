
public class SpacedLogger implements Logger{
	
	
	@Override
	public void Log(String input) {
		
		String modified = addSpace(input);
		System.out.println(modified);
		
	}

	@Override
	public void Error(String input) {
		
		String modified = "ERROR: " + addSpace(input);
		System.out.println(modified);
		
	}
	
	static String addSpace(String input) {
		
		String addSpace = "";
		for (int i = 0; i < input.length(); i++) {
			addSpace += input.charAt(i); 
			addSpace += " ";
		}
		return addSpace;
	}
	
}