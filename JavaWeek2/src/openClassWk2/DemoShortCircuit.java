package openClassWk2;

public class DemoShortCircuit {
	public static void main(String[] args) {
		System.out.println((True() && False() ));

	}
	private static boolean True() {
		System.out.println("true");
		return true;
	}
	private static boolean False() {
		System.out.println("false");
		return false;
	}
}
