import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchAppTest{

    @Test
    void testSearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(LinearSearchApp.searchBogie(bogies, "BG309"));
    }

    @Test
    void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertFalse(LinearSearchApp.searchBogie(bogies, "BG999"));
    }

    @Test
    void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(LinearSearchApp.searchBogie(bogies, "BG101"));
    }

    @Test
    void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        assertTrue(LinearSearchApp.searchBogie(bogies, "BG550"));
    }

    @Test
    void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};

        assertTrue(LinearSearchApp.searchBogie(bogies, "BG101"));
    }
}