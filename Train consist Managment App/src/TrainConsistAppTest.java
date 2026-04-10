import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;

class TrainConsistAppTest {

        int THRESHOLD = 70;

        private List<Bogie> filterBogies(List<Bogie> bogies) {
            return bogies.stream()
                    .filter(b -> b.capacity > THRESHOLD)
                    .toList();
        }

        @Test
        void testFilter_CapacityGreaterThanThreshold() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 80),
                    new Bogie("AC", 65)
            );

            List<Bogie> result = filterBogies(bogies);

            assertEquals(1, result.size());
            assertEquals(80, result.get(0).capacity);
        }

        @Test
        void testFilter_CapacityEqualToThreshold() {
            List<Bogie> bogies = List.of(
                    new Bogie("AC", 70)
            );

            List<Bogie> result = filterBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_CapacityLessThanThreshold() {
            List<Bogie> bogies = List.of(
                    new Bogie("First Class", 50)
            );

            List<Bogie> result = filterBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_MultipleBogiesMatching() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 75),
                    new Bogie("Sleeper", 80),
                    new Bogie("AC", 60)
            );

            List<Bogie> result = filterBogies(bogies);

            assertEquals(2, result.size());
        }

        @Test
        void testFilter_NoBogiesMatching() {
            List<Bogie> bogies = List.of(
                    new Bogie("AC", 60),
                    new Bogie("First Class", 50)
            );

            List<Bogie> result = filterBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_AllBogiesMatching() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 75),
                    new Bogie("Sleeper", 80)
            );

            List<Bogie> result = filterBogies(bogies);

            assertEquals(2, result.size());
        }

        @Test
        void testFilter_EmptyBogieList() {
            List<Bogie> bogies = new ArrayList<>();

            List<Bogie> result = filterBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testFilter_OriginalListUnchanged() {
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 80));
            bogies.add(new Bogie("AC", 60));

            List<Bogie> result = filterBogies(bogies);

            assertEquals(2, bogies.size()); // original list unchanged
        }
    }
}