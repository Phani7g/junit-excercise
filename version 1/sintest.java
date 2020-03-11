/**tests the function sintest
*checks if sin fucntion provides intended result
*/
package version1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sintest {

	@Test
	void test() {
		trig t = new trig();
		float b = t.sinvalue((float)1.5708);
		assertEquals(Math.sin(1.5708),b);
	}

}
