package junit;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import code.StringFunctions;

public class DynamicTestEx {

	@TestFactory
	public Collection<DynamicTest> method1()
	{

		return Arrays.asList(
			
			DynamicTest.dynamicTest("PositiveTest",
				() -> Assertions.assertTrue( StringFunctions.isPalindrome("madam"))),
			DynamicTest.dynamicTest("NegativeTest",
				() -> Assertions.assertFalse( StringFunctions.isPalindrome("sweta"))),		
			DynamicTest.dynamicTest("NegativeTest",
					() -> Assertions.assertFalse( StringFunctions.isPalindrome("Anu")))		
					
				
		);
	}
}
