import java.util.*;

class BogieSortApp {

    public static void sortBogieNames(String[] bogies) {
        Arrays.sort(bogies);
    }

    public static void main(String[] args) {

        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        sortBogieNames(bogies);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogies));
    }
}