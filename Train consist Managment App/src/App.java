import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase5TrainConsistMgmt
 * ============================================================
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * Demonstrates LinkedHashSet to maintain order + uniqueness.
 *
 * @author Developer
 * @version 5.0
 */
class UseCase5TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order ");
        System.out.println("========================================\n");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // --- Add bogies ---
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // --- Try duplicate ---
        train.add("Sleeper"); // ignored

        // Display final formation
        System.out.println("Final Train Formation: " + train);
    }
}