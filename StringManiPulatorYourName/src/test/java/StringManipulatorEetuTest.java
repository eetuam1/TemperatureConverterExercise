import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorEetuTest {
    private static StringManipulatorEetu Manipulator;


    @BeforeAll
    public static void setUpBeforeClass() {
        Manipulator = new StringManipulatorEetu();
    }
    @AfterAll
    public static void tearDownAfterClass() {
        Manipulator = null;
    }

    @BeforeEach
    public void setUp(){}
    @AfterEach
    public void tearDown(){}

    @Test
    public void testReverseManipulate() {
        assertEquals("uteE", Manipulator.ReverseManipulate("Eetu"), "Eetu pitäisi olla takaoperin uteE");
        assertEquals("cba", Manipulator.ReverseManipulate("abc"),"abc pitäisi olla takaperin cba");
        assertNull(Manipulator.ReverseManipulate(null));
    }

    @Test
    public void testCapitalizeManipulate() {
        assertEquals("Anteeksi", Manipulator.CapitalizeManipulate("anteeksi"), "anteeksi isolla alkukirjaimella = Anteeksi");
        assertEquals("Puiu", Manipulator.CapitalizeManipulate("puiu"), "puiu isolla alkukirjaimella = Puiu");
    }
}