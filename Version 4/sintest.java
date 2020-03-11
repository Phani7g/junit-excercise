/**
This class tests for SIN function
This test case successfully executes all the trignometric functions
*/

package version4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sintest {

	@Test
	void testsin()		//This function is used to calculate sin function for different values
	{
		trig t = new trig();
		float a = t.sinvalue((float)1.5708);
		assertEquals((float)Math.sin((float)1.5708),a);
		float b = t.sinvalue((float)0);
		assertEquals((float)Math.sin((float)0),b);
		float c = t.sinvalue((float)0.523599);
		assertEquals((float)Math.sin((float)0.523599),c);
		float d = t.sinvalue((float)1.0472);
		assertEquals((float)Math.sin((float)1.0472),d);
	}

}
