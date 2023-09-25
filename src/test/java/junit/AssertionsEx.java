package junit;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AssertionsEx {

	
	@Test
	@Tag("Regression")
	public void test1()
	{
		String str1="sweta";
		String str2="sweta";
		String str3="Sweta";
		String str4=null;
		
		boolean flag=true;
		boolean flag1=false;
		
		int i=5;
		int j=3;
		
		String[] expArray= {"one","two","ten"};
		String[] actArray= {"one","two","ten"};
		
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("swe");
		list1.add("anu");
		list1.add("res");
		
		Assertions.assertEquals(str1, str2);
		Assertions.assertNotEquals(str1, str3);
		Assertions.assertNull(str4);
		Assertions.assertTrue(flag);
		Assertions.assertFalse(flag1);
		Assertions.assertTrue(j<i);
		Assertions.assertFalse(i<j);
		Assertions.assertArrayEquals(expArray, actArray);
		Assertions.assertFalse(list1.contains("div"));
		Assertions.assertEquals(3, list1.size());
		
		System.out.println("new");
	}
}
