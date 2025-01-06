
package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CartAdd_001.class,
        CartAdd_002.class,
        CartAdd_003.class,
        CartAdd_004.class,
        CartAdd_005.class,
        CartAdd_006.class,
        CartAdd_007.class,
        CartAdd_008.class,


})
public class AllLoginTests {

}
