import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeAll
    public static void setUpClass() {
    }
    @BeforeEach
    public void setUp() {
        account = new Account();
    }

    @AfterAll
    public static void tearDownClass() {
    }
    @AfterEach
    public void tearDown() {
        account = null;
    }

    @Test
    public void testDeposit() {
        account.deposit(1000.0);
        assertEquals(1000.0, account.getBalance(), 0.01);
    }
    @Test
    public void testSuccess() {
        account.deposit(1000.0);
        double withdrawnAmount = account.withdraw(500.0);
        assertEquals(500.0, withdrawnAmount, 0.01);
        assertEquals(500.0, account.getBalance(), 0.01);
    }
    @Test
    public void testFail() {
        double withdrawnAmount = account.withdraw(1500.0);
        assertEquals(0.0, withdrawnAmount, 0.01);
        assertEquals(0.0, account.getBalance(), 0.01);
    }
    @Test
    public void testBalance() {
        account.deposit(2000.0);
        assertEquals(2000.0, account.getBalance(), 0.01);
    }
}
