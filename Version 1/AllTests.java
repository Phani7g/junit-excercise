/** checks for the all the tests
*/
package version1;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({radtodegreetest.class, sintest.class, costest.class, tantest.class})
public class AllTests {   //passedtest checking for presence of all functions
	
}
