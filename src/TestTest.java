import org.junit.Test;

public class TestTest {

    @Test
    public void testTest  () {
        System.out.println("this is testTest");
    }

    @Test(timeout = 100)
    public void testOutTime() throws InterruptedException {
        Thread.sleep(10);
    }

    @Test(expected = ArithmeticException.class)
    public void expectTest() {
        int a = 1/0;
    }
}
