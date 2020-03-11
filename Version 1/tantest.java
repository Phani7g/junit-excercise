/*tests the tan fucntion
* for desired result
*functions tests for tan(90) only and extensive work need to be done on testing
*/
package version1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tantest {       

	@Test
	void test() {
		trig t = new trig();
		float d = t.tanvalue((float) 1.5708);     //tested for tan(90)
		assertEquals(Math.tan(1.5708),d);
	}

}
