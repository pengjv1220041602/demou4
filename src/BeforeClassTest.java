import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeClassTest {

    @BeforeClass
    public static void beforClassTest () {
        System.out.println("before class Test");
    }

    @Test
    public void test1 () {
        System.out.println("---test1---");
    }

    @Test
    public void test2 () {
        System.out.println("---test2---");
    }
}
