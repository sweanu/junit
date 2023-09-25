package junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;

import code.calculator;

public class CalculatorTest {

	//@Disabled
		
		@DisplayName("Two positive num test")
		@Test()
		@Tag("Sanity")
		@Tag("Regression")
		public void test1() {
			
			int result = calculator.add(4, 5);
			Assertions.assertEquals(9, result);
		}
		
		@DisplayName("One positive num and one negative num test")
		@Test
		@Tag("Regression")
		public void test2() {
			
			int result = calculator.add(-4, 5);
			Assertions.assertEquals(1, result);
		}
		
		@RepeatedTest(3)
		@DisplayName("Two positive num test where result is not matching")
		public void test3() {
			
			int result = calculator.add(4, 5);
			Assertions.assertNotEquals(10, result);
		}
		
		@CustomAnnotation
		public void test4() {
			
			int result = calculator.add(4, 5);
			Assertions.assertNotEquals(10, result);
		}

	}

