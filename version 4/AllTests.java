/**
VERSION-4
this class is used to test all the functions
 */

package version4;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)		
@SuiteClasses({radtodegreetest.class, sintest.class, costest.class, tantest.class}) //suite class contains all functions
public class AllTests
{

}
