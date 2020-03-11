/** test the function radttodegreetest
*checks if the input is converted from radian to degrees or not 
*checks for only one value and it's nnot a good practice and needs to be changed
*/
package version1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class radtodegreetest {

	@Test
	void test() {
		trig t = new trig();
		double a = (int)t.radtodegree((float)1.5708);
		assertEquals(90,a);
	}

}
