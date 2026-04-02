import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase3TrainConsistMgmt
 * ============================================================
 *
 * Use Case 3: Track Unique Bogie IDs
 *
 * Description:
 * Demonstrates use of HashSet to store unique bogie IDs.
 *
 * @author Developer
 * @version 3.0
 */
class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // --- ADD IDs (including duplicates) ---
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (ignored automatically)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display unique bogies
        System.out.println("Unique Bogie IDs: " + bogies);

        // Check existence
        System.out.println("Contains BG103? " + bogies.contains("BG103"));

        // Total unique count
        System.out.println("Total Unique Bogies: " + bogies.size());
    }
}