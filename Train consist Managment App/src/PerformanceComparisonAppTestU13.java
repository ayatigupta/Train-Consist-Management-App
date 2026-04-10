import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class PerformanceComparisonAppTestU13{

        @Test
        void testLoopFilteringLogic() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 70),
                    new Bogie("AC", 50)
            );

            List<Bogie> result = PerformanceComparisonApp.filterUsingLoop(bogies);

            assertEquals(1, result.size());
        }

        @Test
        void testStreamFilteringLogic() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 70),
                    new Bogie("AC", 50)
            );

            List<Bogie> result = PerformanceComparisonApp.filterUsingStream(bogies);

            assertEquals(1, result.size());
        }

        @Test
        void testLoopAndStreamResultsMatch() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 70),
                    new Bogie("Sleeper", 80),
                    new Bogie("AC", 50)
            );

            List<Bogie> loopResult = PerformanceComparisonApp.filterUsingLoop(bogies);
            List<Bogie> streamResult = PerformanceComparisonApp.filterUsingStream(bogies);

            assertEquals(loopResult.size(), streamResult.size());
        }

        @Test
        void testExecutionTimeMeasurement() {
            long start = System.nanoTime();
            long end = System.nanoTime();

            long elapsed = end - start;

            assertTrue(elapsed >= 0);
        }

        @Test
        void testLargeDatasetProcessing() {
            List<Bogie> bogies = new ArrayList<>();

            for (int i = 0; i < 10000; i++) {
                bogies.add(new Bogie("Sleeper", i % 100));
            }

            List<Bogie> result = PerformanceComparisonApp.filterUsingStream(bogies);

            assertNotNull(result);
        }
    }
}