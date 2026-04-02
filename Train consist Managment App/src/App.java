import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase7TrainConsistMgmt
 * ============================================================
 *
 * Use Case 7: Sort Bogies by Capacity
 *
 * Description:
 * Demonstrates sorting using Comparator.
 *
 * @author Developer
 * @version 7.0
 */
class UseCase7TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC7 - Sort Bogies by Capacity ");
        System.out.println("========================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 30));

        // Sort using Comparator (ascending)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("Sorted Bogies (Ascending Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " → " + b.capacity);
        }

        // Sort descending
        bogies.sort((a, b) -> b.capacity - a.capacity);

        System.out.println("\nSorted Bogies (Descending Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " → " + b.capacity);
        }
    }
}

/**
 * Bogie class (custom object)
 */
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
}