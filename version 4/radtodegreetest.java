/**
This class tests for Radians to degree conversion
This test case successfully executes all the trignometric functions
*/

package version4;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class radtodegreetest {

	@Test
	void testradtodegree()		//This function is used to convert radians to degree for different values
	{
		trig t = new trig();
		double a = (int)t.radtodegree((float)1.5708);
		assertEquals(90,a);
		int b = (int)t.radtodegree(0);
		assertEquals(0,b);
		int c = (int)t.radtodegree((float)0.523599);
		assertEquals(30,c);
		int d = (int)t.radtodegree((float)1.0472);
		assertEquals(60,d);
		
	}

}
