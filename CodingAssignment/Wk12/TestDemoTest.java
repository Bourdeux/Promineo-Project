import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;



class TestDemoTest {

	@BeforeEach
	void setUp() throws Exception {

	}

	@ParameterizedTest
	@MethodSource("TestDemoTest#argumentsForAddPositive")
	void assertThatTwoPositiveNumbersAreAddedCorrectly(int a, int b, int expected, boolean expectException ) {
		TestDemo addition = new TestDemo();
		
		if(!expectException) {
			assertThat(addition.addPositive(a, b)).isEqualTo(expected);
		} else {
			assertThatThrownBy(() -> 
		    addition.addPositive(a, b))
		        .isInstanceOf(IllegalArgumentException.class);
		}
	}

	static Stream<Arguments> argumentsForAddPositive() {
		return Stream.of(
				arguments(1,2,3,false),
				arguments(5,6,10,true),
				arguments(13,2,15,false),
				arguments(50,20,100,false),
				arguments(0,-2,0,true)
				);
	}
	
	@Test
	void assertThatNumberSquaredIsCorrect() {
				
		TestDemo testDemo = new TestDemo();
		TestDemo mockDemo = spy(testDemo);
		doReturn(5).when(mockDemo).getRandomInt();
		int fiveSquared = mockDemo.randomNumberSquared();
		assertThat(fiveSquared).isEqualTo(25);
	}
}
