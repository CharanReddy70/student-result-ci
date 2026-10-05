import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentResultTest {

    @Test
    public void testCalculateTotal() {
        StudentResult result = new StudentResult();

        int total = result.calculateTotal(80, 75, 90);

        assertEquals(245, total);
    }

    @Test
    public void testCalculateAverage() {
        StudentResult result = new StudentResult();

        double average = result.calculateAverage(80, 75, 90);

        assertEquals(81.67, average, 0.01);
    }

    @Test
    public void testCalculateGrade() {
        StudentResult result = new StudentResult();

        String grade = result.calculateGrade(81.67);

        assertEquals("B", grade);
    }

    @Test
    public void testIsPassed() {
        StudentResult result = new StudentResult();

        boolean passed = result.isPassed(81.67);

        assertTrue(passed);
    }
}