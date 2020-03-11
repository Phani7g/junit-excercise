/**Test checks for the working of cosvalue working
* checks for value cos(90)
*/
package version1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class costest {                    //failed cos test  

	@Test
	void test() {
		trig t = new trig();
		float c = t.cosvalue((float)1.5708);     //test failed as itfound issue in implentation of cosvalue function 
		assertEquals(Math.cos(1.5708),c);
	}

}
