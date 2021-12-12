package ro.ase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    private Application application;

    @Before
    public void setup() {
        application = new Application();
    }

    @Test
    public void method1() {
        var expected = 1;
        var actual = application.method1();

        assertEquals(actual, expected);
    }

    @Test
    public void method2() {
        var expected = 2;
        var actual = application.method2();

        assertEquals(actual, expected);
    }
}
