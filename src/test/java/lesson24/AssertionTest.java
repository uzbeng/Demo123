package lesson24;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTest {
	
	//@Test
	public void testHardAssert() {
		String str1 = "Hello";
		
		Assert.assertEquals(str1,"Hello", "Message for indication method=testHardAssert()");
		
		Assert.assertFalse(5>3, "5>3 example");
		
		boolean checkedValue = true;
		Assert.assertTrue(checkedValue, "Checking boolean");
		
		boolean checkedValueFalse = false;
		Assert.assertFalse(checkedValueFalse, "assertFalse example");	
		
		
	}
	
	//@Test
	public void testSoftAssert() {
		SoftAssert softAssert = new SoftAssert();
		
		String str1 = "Hell";
		
		softAssert.assertEquals(str1,"Hello", "Message for indication method=testSoftAssert()");
		
		boolean checkedValue = true;
		softAssert.assertTrue(checkedValue, "Checking boolean");
		
		boolean checkedValueFalse = false;
		softAssert.assertFalse(checkedValueFalse, "assertFalse example");
		
		softAssert.assertFalse(5>3, "5>3 example");
		
		// Get the results
		softAssert.assertAll();
		
		
	}
	
	@Test
	public void testMixedAssert() {
		SoftAssert softAssert = new SoftAssert();
		
		//1
		String str1 = "Hell";		
		softAssert.assertEquals(str1,"Hello", "Message for indication method=testSoftAssert()");
		
		//2
		boolean checkedValue = false;
		Assert.assertTrue(checkedValue, "Checking boolean");
		// STOP
		
		//3
		boolean checkedValueFalse = false;
		softAssert.assertFalse(checkedValueFalse, "assertFalse example");
		//4
		softAssert.assertFalse(5>3, "5>3 example");
		
		// Get the results
		softAssert.assertAll();
		
		
	}

}
