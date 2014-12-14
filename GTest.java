package guava;
import static org.junit.Assert.*;

import org.junit.Test;


public class GTest 
{

	@Test
	public void test()
	{
		String name = "Hans";
		int age = 32;
		boolean isStudent = true;
		double weight = 80.5;
		assertTrue(age > 0);
		assertTrue(weight > 0);
		TestGuava t1 = new TestGuava(name, age, isStudent, weight);
		System.out.println(t1.toString());
	}

}
