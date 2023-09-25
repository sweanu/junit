package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import code.StringFunctions;

public class ParametersEx {
	
	@ParameterizedTest
	@ValueSource(strings= {"madam","dad","radar"})
	public void test1(String value) {
		
		Assertions.assertTrue(StringFunctions.isPalindrome(value));
	}
	
	@ParameterizedTest
	@ValueSource(ints= {8,2,4})
	public void test2(int num)
	{
		Assertions.assertTrue(num%2==0);
	}

}
