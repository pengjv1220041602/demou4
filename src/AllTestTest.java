import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class AllTestTest {

    /*@Test
    public void allTestTest1 () {
        System.out.println("aaaaa");
    }*/

//    public static junit.framework.Test.suite(){
    public static junit.framework.Test suite() {
        System.out.println("suite");
        return TestSuite.warning("3333");
    }
}
