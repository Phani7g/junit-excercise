/**
VERSION-3
this class is used to test all the functions
 */

package version3;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({radtodegreetest.class, sintest.class, costest.class, tantest.class}) //Suite class contains all functions
public class AllTests {
	
}
