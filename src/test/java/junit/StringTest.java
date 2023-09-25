package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import code.StringFunctions;

public class StringTest {

	@Test
	public void palindrome() {
		
		Assertions.assertTrue( StringFunctions.isPalindrome("madam"));
	}
	
	@Test
	public void notpalindrome() {
		
		Assertions.assertFalse( StringFunctions.isPalindrome("sweta"));
	}
}
