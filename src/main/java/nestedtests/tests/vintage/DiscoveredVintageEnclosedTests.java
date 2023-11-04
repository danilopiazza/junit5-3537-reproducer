package nestedtests.tests.vintage;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class DiscoveredVintageEnclosedTests {
    public static class DiscoveredEnclosedTests {
        @Test
        public void vintageEnclosedTest() {
            System.out.println("RUNNING discovered enclosed vintage tests TWICE");
            assertTrue(true);
        }
    }
}
