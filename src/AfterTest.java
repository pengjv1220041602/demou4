import org.junit.After;
import org.junit.Test;

public class AfterTest {
    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @After
    public void testAfter() {
        System.out.println("----after -------");
    }
}
