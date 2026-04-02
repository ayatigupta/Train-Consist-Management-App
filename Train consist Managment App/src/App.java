import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase6TrainConsistMgmt
 * ============================================================
 *
 * Use Case 6: Map Bogie to Capacity
 *
 * Description:
 * Demonstrates HashMap to associate bogies with capacity.
 *
 * @author Developer
 * @version 6.0
 */
class UseCase6TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC6 - Map Bogie to Capacity ");
        System.out.println("========================================\n");

        // Create HashMap (bogie → capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // --- Insert values ---
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 50);
        bogieCapacity.put("First Class", 30);
        bogieCapacity.put("Goods Rectangular", 100);
        bogieCapacity.put("Goods Cylindrical", 120);

        // --- Display mapping ---
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(
                    entry.getKey() + " → Capacity: " + entry.getValue()
            );
        }

        // --- Example lookup ---
        System.out.println("\nCapacity of Sleeper: " +
                bogieCapacity.get("Sleeper"));
    }
}