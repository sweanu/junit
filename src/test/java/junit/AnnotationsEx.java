package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import code.calculator;

public class AnnotationsEx {

	
	@BeforeAll
	public static void Beforeall()
	{
		System.out.println("Before All");
	}
	
	@BeforeEach
	public void Beforejunit()
	{
		System.out.println("Before junit");
	}
	
	@Test()
	public void test1() {
		
		int result = calculator.add(4, 5);
		Assertions.assertEquals(9, result);
	}
	

	@Test()
	public void test2() {
		
		int result = calculator.add(4, 5);
		Assertions.assertEquals(10, result);
	}
	
	@AfterEach
	public void Afterjunit()
	{
		System.out.println("After junit");
	}
	
	@AfterAll
	public static void Afterall()
	{
		System.out.println("After All");
	}
}
