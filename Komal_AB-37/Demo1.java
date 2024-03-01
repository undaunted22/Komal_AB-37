package assertion_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
public Demo1(String string) {
		
	}

@Test
public void meth() {
    // Create two objects with different properties
    Demo1 obj1 = new Demo1("m");
    Demo1 obj2 = new Demo1("q");

    // Assert that the objects are not equal
    Assert.assertNotEquals(obj1, obj2);
    Assert.assertNotEquals(obj1, obj2);
}
	
	
	
	
}
