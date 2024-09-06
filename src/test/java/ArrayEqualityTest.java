import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 }; // Matches a1
        assertArrayEquals(a1, a2, "should be equal"); // Should pass
        int[] a3 = { 2, 3, 5, 8 }; // Does not match a1
        assertArrayEquals(a1, a3, "Arrays should be equal");
    }


    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12, "Should be equal"); // Should pass

        // Test with unequal arrays
        int[][] a13 = { { 2, 3 }, { 5, 7 }, { 11, 13 } }; // Match the expected array
        assertArrayEquals(a11, a13, "Arrays should be equal"); // Should pass
    }

    @Test
    public void testStringArrayEquality() {
        String[] a1 = { "apple", "banana", "date" };
        String[] a2 = { "apple", "banana", "date" };
        assertArrayEquals(a1, a2, "String arrays should be equal"); // Should pass

        // Test with unequal arrays
        String[] a3 = { "apple", "banana", "date" }; // Match the expected array
        assertArrayEquals(a1, a3, "String arrays should be equal"); // Should pass
    }
}
