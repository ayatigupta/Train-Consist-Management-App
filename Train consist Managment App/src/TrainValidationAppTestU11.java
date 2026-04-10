import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class TrainValidationAppTestU11{
{

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(TrainValidationApp.isValidTrainID("TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(TrainValidationApp.isValidTrainID("TRAIN12"));
        assertFalse(TrainValidationApp.isValidTrainID("TRN12A"));
        assertFalse(TrainValidationApp.isValidTrainID("1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(TrainValidationApp.isValidCargoCode("PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(TrainValidationApp.isValidCargoCode("PET-ab"));
        assertFalse(TrainValidationApp.isValidCargoCode("PET123"));
        assertFalse(TrainValidationApp.isValidCargoCode("AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(TrainValidationApp.isValidTrainID("TRN-123"));
        assertFalse(TrainValidationApp.isValidTrainID("TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(TrainValidationApp.isValidCargoCode("PET-Ab"));
        assertFalse(TrainValidationApp.isValidCargoCode("PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(TrainValidationApp.isValidTrainID(""));
        assertFalse(TrainValidationApp.isValidCargoCode(""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(TrainValidationApp.isValidTrainID("TRN-1234XYZ"));
        assertFalse(TrainValidationApp.isValidCargoCode("PET-ABCD"));
    }
}