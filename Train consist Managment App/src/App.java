 class LinearSearchApp {

    public static boolean searchBogie(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {
            if (bogies[i].equals(key)) {
                return true; // found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        String searchKey = "BG309";

        boolean found = searchBogie(bogies, searchKey);

        if (found) {
            System.out.println("Bogie Found");
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}