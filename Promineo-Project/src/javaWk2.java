
public class javaWk2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//if stmt allows us to assign boolean value or expression inside a {} following the word "if"
		String name = "Bour";
		
		if (name == "Bour") {
			System.out.println("Hello Bour!");
		} else {
			System.out.println("You are not Bour, " + name);
		}
		
		int age = 20;
		
		if (age >= 30) {
			System.out.println("You are old!");
		} else {
			System.out.println("You are a baby until you are " + (30 - age) + " year(s) older!");
		}
		
		double costOfPhoneCase = 30;				
		
		if (costOfPhoneCase <= 20) {
			System.out.println("Buy the cheap case");
		} else if (costOfPhoneCase <= 30) {
			System.out.println("Buy Gudetama case");
		} else {
			System.out.println("Dont buy phone case");
		}
		
		char grade = 'E';
		
		switch (grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			break;
		default:
			System.out.println("0");
		}
		
		if (5 == 5 && 2 == 2) {
			System.out.println("Yes");
			}
		
		
	}
}
