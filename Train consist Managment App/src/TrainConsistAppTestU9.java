import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;


class TrainConsistAppTestU9 {
        private Map<String, List<Bogie>> groupBogies(List<Bogie> bogies) {
            return bogies.stream()
                    .collect(Collectors.groupingBy(b -> b.name));
        }

        @Test
        void testGrouping_BogiesGroupedByType() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 70)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(1, result.size());
            assertTrue(result.containsKey("Sleeper"));
        }

        @Test
        void testGrouping_MultipleBogiesInSameGroup() {
            List<Bogie> bogies = List.of(
                    new Bogie("AC Chair", 56),
                    new Bogie("AC Chair", 60)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(2, result.get("AC Chair").size());
        }

        @Test
        void testGrouping_DifferentBogieTypes() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56),
                    new Bogie("First Class", 24)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(3, result.size());
        }

        @Test
        void testGrouping_EmptyBogieList() {
            List<Bogie> bogies = new ArrayList<>();

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertTrue(result.isEmpty());
        }

        @Test
        void testGrouping_SingleBogieCategory() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 75)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(1, result.size());
        }

        @Test
        void testGrouping_MapContainsCorrectKeys() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 72),
                    new Bogie("AC Chair", 56),
                    new Bogie("First Class", 24)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertTrue(result.containsKey("Sleeper"));
            assertTrue(result.containsKey("AC Chair"));
            assertTrue(result.containsKey("First Class"));
        }

        @Test
        void testGrouping_GroupSizeValidation() {
            List<Bogie> bogies = List.of(
                    new Bogie("Sleeper", 72),
                    new Bogie("Sleeper", 70),
                    new Bogie("AC Chair", 56)
            );

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(2, result.get("Sleeper").size());
            assertEquals(1, result.get("AC Chair").size());
        }

        @Test
        void testGrouping_OriginalListUnchanged() {
            List<Bogie> bogies = new ArrayList<>();
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("AC Chair", 56));

            Map<String, List<Bogie>> result = groupBogies(bogies);

            assertEquals(2, bogies.size()); // original list unchanged
        }
    }
}