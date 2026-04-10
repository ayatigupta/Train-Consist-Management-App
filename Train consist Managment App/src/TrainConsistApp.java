import java.util.*;
import java.util.stream.*;

class Bogie {
    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return type + " Bogie - Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        // Step 1: Create list of bogies (reuse UC7 style)
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 80));

        // Step 2: Apply Stream Filtering
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60) // condition
                .collect(Collectors.toList());

        // Step 3: Display Result
        System.out.println("Filtered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        // Step 4: Verify original list unchanged
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);
    }
}