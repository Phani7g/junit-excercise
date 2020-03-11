/**
This class tests for TAN function
This test case successfully executes all the trignometric functions
*/

package version4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tantest {

	@Test
	void test()		//This function is used to calculate tan function for different values
	{
		trig t = new trig();
		float a = t.tanvalue((float) 1.5708);
		assertEquals((float)Math.tan((float)1.5708),a);
		float b = t.tanvalue((float)0);
		assertEquals((float)Math.tan((float)0),b);
		float c = t.tanvalue((float)0.523599);
		assertEquals((float)Math.tan((float)0.523599),c);

	}

}
