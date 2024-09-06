import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TemperatureConverterTest {
    private TemperatureConverter converter;

    @Before
    public void setUp() {
        converter = new TemperatureConverter();
    }

    @Test
    public void testFahrenheitToCelsius() {
        // Common case
        assertEquals(0.0, converter.fahrenheitToCelsius(32), 0.001);
        // Boiling point of water
        assertEquals(100.0, converter.fahrenheitToCelsius(212), 0.001);
        // Extreme case
        assertEquals(-40.0, converter.fahrenheitToCelsius(-40), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {
        // Common case
        assertEquals(32.0, converter.celsiusToFahrenheit(0), 0.001);
        // Boiling point of water
        assertEquals(212.0, converter.celsiusToFahrenheit(100), 0.001);
        // Extreme case
        assertEquals(-40.0, converter.celsiusToFahrenheit(-40), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        // Extremely low temperature
        assertTrue(converter.isExtremeTemperature(-50));
        // Extremely high temperature
        assertTrue(converter.isExtremeTemperature(60));
        // Normal temperature
        assertFalse(converter.isExtremeTemperature(20));
        // Another normal temperature
        assertFalse(converter.isExtremeTemperature(-10));
    }

}
