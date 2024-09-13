import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;
import static java.lang.Math.*;

public class MainTest {

    @org.junit.jupiter.api.Test
    void gematriaTest1() {
        /// AAA
        // Arrange
        String s = "";

        // Act - call the method under test (MUT)
        int actual = Main.gematria(s);

        // Assert
        assertEquals(0, actual);
        double x = pow(2,4);
    }
    @org.junit.jupiter.api.Test
    void gematriaTest2() {
        /// AAA
        // Arrange
        String s = "a";

        // Act - call the method under test (MUT)
        int actual = Main.gematria(s);

        // Assert
        assertEquals(1, actual);
    }
    @org.junit.jupiter.api.Test
    void gematriaTest3() {
        /// AAA
        // Arrange
        String s = "Abba @$#%$#9   T";

        // Act - call the method under test (MUT)
        int actual = Main.gematria(s);

        // Assert
        assertEquals(206, actual);
    }
}