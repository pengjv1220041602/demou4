import com.sun.org.apache.xpath.internal.operations.String;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AssertTest {

    private Student[] sArray;

    @Before
    public void BeforeTest () {
        sArray = new Student[]{new Student("12", "小米")};
    }

    @Test
    public void test1 () {
       Student[] mockStudent = new Student[]{new Student("12", "小米")};
        Assert.assertArrayEquals(sArray, mockStudent);
    }

    @Test
    public void test2() {
        double[] ex = {1,2};
        double[] ac = {3,4};
        Assert.assertArrayEquals(ex, ac, 2);
    }

    @Test
    public void test3 () {
        Student[] mockS = {new Student("12", "小米")};
        Assert.assertArrayEquals("调用失败了", mockS, sArray);
    }

    @Test
    public void test4 () {
        double[] da1 = {1,1,1};
        double[] da2 = {3,-1,1};
        Assert.assertArrayEquals("error", da1, da2, 2);
    }

    @Test
    public void test5 () {
        Assert.assertTrue("返回了false", true);
    }

    @Test
    public void test6 () {
        Student s = new Student();
        Assert.assertNotNull("对象为Null了", s);
    }

    @Test
    public void test7() {
        Student s1 = new Student("12", "12");
        Student s2 = new Student("12", "12");
        s2 = s1;
        Assert.assertSame("对象不同", s1,s2);
    }

    @Test
    public void test8 () {
        Assert.fail();
    }

    @Test
    public void test9 () {
        Assert.assertThat("lala", "11", CoreMatchers.anything("3333"));
    }

    @Test
    public void test10 () {
        Assert.assertThat("not instanceOf", new Student("2","3"), CoreMatchers.any(Student.class));
        Assert.assertThat("not instanceOf", new Student(), CoreMatchers.any(Object.class));
    }

    @Test
    public void test11 () {
        List<Student> ls = Arrays.asList(new Student("11", "22"));
        Assert.assertThat("error", new Student(), CoreMatchers.equalTo("23"));
    }

    @Test
    public void test12 () {
        Assert.assertThat("error", new Student(), CoreMatchers.instanceOf(Student.class));
    }

    @Test
    public void test13 () {
        Assert.assertThat("error", new Student(), CoreMatchers.is(Student.class));
    }

    @Test
    public void test14 () {
        Assert.assertThat("error", new Student(), CoreMatchers.not(new Student()));
    }

    @Test
    public void test15 () {
        Assert.assertThat("error", null, CoreMatchers.notNullValue());
    }

    @Test
    public void test16() {
        Assert.assertThat("error", null, CoreMatchers.notNullValue(Integer.class));
    }

    @Test
    public void test17 () {
        final Student student = new Student();
        Assert.assertThat("error", student, CoreMatchers.sameInstance(student));
    }

    @Test
    public void test18 () {
        List<Matcher<? super Student>> ls = new ArrayList<>();
        ls.add(CoreMatchers.instanceOf(Student.class));
        ls.add(CoreMatchers.instanceOf(Student.class));
        ls.add(CoreMatchers.not(String.class));
        Assert.assertThat("error", new Student(), CoreMatchers.allOf(ls));
    }

    @Test
    public void test19 () {
//        final Matcher<java.lang.String> objectMatcher = CoreMatchers.allOf(CoreMatchers.instanceOf(java.lang.String.class));
//        Assert.assertThat("error", new Object(), CoreMatchers.allOf(CoreMatchers.insta));
    }
}
