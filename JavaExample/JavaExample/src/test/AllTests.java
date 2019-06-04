import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ibs_Firefox.class, Ibs_chrome.class, Ibs_staging3.class,
		Ibs_staging4.class, Ibsie.class, ibIE.class })
public class AllTests {

}
