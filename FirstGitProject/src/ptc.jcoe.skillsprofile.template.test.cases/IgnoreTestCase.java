package ptc.jcoe.skillsprofile.template.test.cases;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreTestCase {

	@Ignore("Not Ready to Run")  
	@Test
	public void divisionWithException() {  
	  System.out.println("Method is not ready yet");
	}  
	
}
