import java.util.*;

class BinarySearchApp {

    public static boolean binarySearch(String[] bogies, String key) {

        // Ensure sorted (important)
        Arrays.sort(bogies);

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String key = "BG309";

        boolean found = binarySearch(bogies, key);

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }
}