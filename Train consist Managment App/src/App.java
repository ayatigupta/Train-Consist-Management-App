import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * Demonstrates CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */
class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("========================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // --- CREATE (Add bogies) ---
        passengerBogies.add("B1");
        passengerBogies.add("B2");
        passengerBogies.add("B3");

        System.out.println("After Adding Bogies: " + passengerBogies);

        // --- READ (Check availability) ---
        System.out.println("Is B2 present? " + passengerBogies.contains("B2"));

        // --- UPDATE (Modify bogie) ---
        passengerBogies.set(1, "B2-Updated");
        System.out.println("After Update: " + passengerBogies);

        // --- DELETE (Remove bogie) ---
        passengerBogies.remove("B3");
        System.out.println("After Removal: " + passengerBogies);

        // Final state
        System.out.println("\nFinal Train Consist: " + passengerBogies);
    }
}