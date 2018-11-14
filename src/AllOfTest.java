import org.hamcrest.core.AllOf;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.anything;

public class AllOfTest {

    @Test
    public void test1 () {
        AllOf.allOf(anything());
    }

}
