import org.junit.AfterClass;
import org.junit.Test;

public class AfterClassTest {

    @AfterClass
    public static void afterClassTest() {
        System.out.println("after class test");
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
