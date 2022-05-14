import java.util.Random;

public class TestDemo {

	public int addPositive (int a, int b) {
		int result = 0;
		if (a > 0 && b > 0) {
			return result = a + b;		
		} else {
			throw new IllegalAccessError("Both arguments must be positive!");
		}		
	}
	
	public int randomNumberSquared() {
		int a = getRandomInt();
		int b = a;
		int squaredResult = a*b;
		return squaredResult;
	}

	public int getRandomInt() {
		Random random = new Random();
		return random.nextInt(10) + 1;
	}

}
