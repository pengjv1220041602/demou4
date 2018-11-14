import org.junit.Before;
import org.junit.Test;

public class BeforeTest {

    @Before
    public void beforeTest() {
        System.out.println("before test");
    }

    @Test
    public void test1 () {
        System.out.println("test1");
    }

    @Test
    public void test2 () {
        System.out.println("test2");
    }
}
