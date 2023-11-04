package nestedtests.tests.vintage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class VintageEnclosedTests {
    public static class EnclosedTests {
        @Test
        public void vintageEnclosedTest() {
            System.out.println("RUNNING enclosed vintage tests ONCE");
            assertTrue(true);
        }
    }
}
