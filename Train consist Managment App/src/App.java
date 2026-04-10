import java.util.*;

 class SafeSearchApp {

    public static boolean searchBogie(String[] bogies, String key) {

        // Fail-fast validation
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Linear search (can reuse UC18 logic)
        for (String b : bogies) {
            if (b.equals(key)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309"};

        boolean found = searchBogie(bogies, "BG205");

        System.out.println(found ? "Bogie Found" : "Bogie Not Found");
    }
}