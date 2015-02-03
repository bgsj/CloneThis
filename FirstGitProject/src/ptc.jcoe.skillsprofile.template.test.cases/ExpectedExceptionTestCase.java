package ptc.jcoe.skillsprofile.template.test.cases;

import org.junit.Test;

public class ExpectedExceptionTestCase {

	@Test(expected = ArithmeticException.class)  
	public void divisionWithException() {  
	int i = 1/0;
	} 
	
}
