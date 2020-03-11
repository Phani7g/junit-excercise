/**
This class tests for TAN function
This test case successfully executes radians to degree conversion, cos and sin function, but fails for TAN functions.
 */

package version3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tantest {

	@Test
	void test() {     //This function is used to calculate TAN function for diffrent values
		trig t = new trig();
		float a = t.tanvalue((float) 1.5708);
		assertEquals((float)Math.tan((float)1.5708),a);
		float b = t.tanvalue((float)0);
		assertEquals((float)Math.tan((float)0),b);
		float c = t.tanvalue((float)0.523599);
		assertEquals((float)Math.tan((float)0.523599),c);
		
	}

}
