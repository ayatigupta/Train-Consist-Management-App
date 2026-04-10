import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SafeSearchAppTest {

    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};

        Exception ex = assertThrows(IllegalStateException.class, () -> {
            SafeSearchApp.searchBogie(bogies, "BG101");
        });

        assertEquals("No bogies available for search", ex.getMessage());
    }

    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101","BG205"};

        assertDoesNotThrow(() -> {
            SafeSearchApp.searchBogie(bogies, "BG101");
        });
    }

    @Test
    void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};

        assertTrue(SafeSearchApp.searchBogie(bogies, "BG205"));
    }

    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};

        assertFalse(SafeSearchApp.searchBogie(bogies, "BG999"));
    }

    @Test
    void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};

        assertTrue(SafeSearchApp.searchBogie(bogies, "BG101"));
    }
}