
public class AsteriskLogger implements Logger{

	private String output1 = "***";
	private String output2 = "***";
	
	
	@Override
	public void Log(String input) {
				
		String finalOutput = output1 + input + output2;
		System.out.println(finalOutput);
		
	}

	@Override
	public void Error(String input) {
		
		StringBuilder topBox = new StringBuilder();
		StringBuilder bottomBox = new StringBuilder();
		String middleBox = "Error: " + input;
		
		String errorOutput = output1 + middleBox + output2;
		
		/*Added loop to add '*' so output will always be a box
		 * based on input length
		 */
		
		for (int i = 0; i < errorOutput.length(); i++) {
			topBox.append("*");
			bottomBox.append("*");
		}
		System.out.println(topBox + "\n" + errorOutput + "\n" + bottomBox);
		
	}

}

