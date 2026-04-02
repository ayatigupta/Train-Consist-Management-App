import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase4TrainConsistMgmt
 * ============================================================
 *
 * Use Case 4: Maintain Ordered Bogie IDs
 *
 * Description:
 * Demonstrates LinkedList to maintain ordered train consist.
 *
 * @author Developer
 * @version 4.0
 */
class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie IDs ");
        System.out.println("========================================\n");

        // Create LinkedList for train consist
        LinkedList<String> train = new LinkedList<>();

        // --- Add bogies ---
        train.add("Engine");
        train.add("Sleeper");
        train.add("AC");
        train.add("Cargo");
        train.add("Guard");

        System.out.println("Initial Train: " + train);

        // --- Insert Pantry at position 2 ---
        train.add(2, "Pantry");
        System.out.println("After Adding Pantry: " + train);

        // --- Remove first and last ---
        train.removeFirst();
        train.removeLast();

        // Final output
        System.out.println("Final Train Consist: " + train);
    }
}
