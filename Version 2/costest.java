/**
This class tests for COS function
This test case successfully executes radians to degree conversion and sin function, but fails for COS and TAN functions.
*/

package version2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class costest {

	@Test
	void test() {  //This function is used to calculate COS function for different values
		trig t = new trig();
		float c = t.cosvalue((float)1.5708);
		assertEquals(Math.cos(1.5708),a);
		float b = t.cosvalue((float)0);
		assertEquals((float)Math.cos((float)0),b);
		float c = t.cosvalue((float)0.523599);
		assertEquals((float)Math.cos((float)0.523599),c);
		float d = t.cosvalue((float)1.0472);
		assertEquals((float)Math.cos((float)1.0472),d);
	}

}
