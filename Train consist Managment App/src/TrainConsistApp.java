import java.util.regex.*;

 class TrainValidationApp {

    public static boolean isValidTrainID(String trainId) {
        String regex = "TRN-\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(trainId);
        return matcher.matches();
    }

    public static boolean isValidCargoCode(String cargoCode) {
        String regex = "PET-[A-Z]{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cargoCode);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        System.out.println("Train ID Valid: " + isValidTrainID(trainId));
        System.out.println("Cargo Code Valid: " + isValidCargoCode(cargoCode));
    }
}