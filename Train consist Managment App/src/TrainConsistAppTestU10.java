import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;

public class TrainConsistAppTestU10 {

    private int totalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 56)
        );

        assertEquals(128, totalSeats(bogies));
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("Sleeper", 80),
                new Bogie("AC", 50)
        );

        assertEquals(200, totalSeats(bogies));
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = List.of(
                new Bogie("First Class", 40)
        );

        assertEquals(40, totalSeats(bogies));
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        assertEquals(0, totalSeats(bogies));
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 60),
                new Bogie("AC", 40)
        );

        assertEquals(100, totalSeats(bogies));
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 30),
                new Bogie("AC", 30),
                new Bogie("First", 40)
        );

        assertEquals(100, totalSeats(bogies));
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC", 56));

        totalSeats(bogies);

        assertEquals(2, bogies.size());
    }
}