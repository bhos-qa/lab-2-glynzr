package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {

    @Test
    public void testCalculateArea() {
        App app = new App();

        // Test with radius 5
        double radius = 5.0;
        double expectedArea = Math.PI * radius * radius;
        double actualArea = app.calculateArea(radius);
        assertEquals(expectedArea, actualArea, 0.0001);  // Allowing for a small delta

        // Test with radius 0 (should return 0)
        radius = 0.0;
        expectedArea = 0.0;
        actualArea = app.calculateArea(radius);
        assertEquals(expectedArea, actualArea, 0.0001);

        // Test with a negative radius (not typically valid, but can test for behavior)
        radius = -3.0;
        expectedArea = Math.PI * radius * radius;  // Should return a positive area
        actualArea = app.calculateArea(radius);
        assertEquals(expectedArea, actualArea, 0.0001);
    }
}
