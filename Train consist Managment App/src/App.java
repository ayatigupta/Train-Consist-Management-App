import java.util.*;

/**
 * ============================================================
 * MAIN CLASS - UseCase1TrainConsistMgmt
 * ============================================================
 *
 * Use Case 1: Initialize Train and Display Consist Summary
 *
 * Description:
 * Entry point of Train Consist Management Application.
 * Initializes train consist and displays initial state.
 *
 * @author Developer
 * @version 1.0
 */
class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("========================================");
        System.out.println("   Train Consist Management App");
        System.out.println("========================================\n");

        // Create list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial state
        System.out.println("Train initialized successfully...");
        System.out.println("Total bogies: " + trainConsist.size());
        System.out.println("Current train consist: " + trainConsist);
    }
}