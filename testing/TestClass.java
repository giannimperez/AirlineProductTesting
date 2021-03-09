import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

  private Login login;
  private ticket ticket;

  @BeforeEach
  public void setUp() {
    login = new Login();
    ticket = new ticket();
  }

  @AfterEach
  public void tearDown() {
    login = null;
    ticket = null;
  }

  /** This is an input analysis test and is also a multidimensional test. */
  @Test
  public void inputAnalysisTest() {
    int total;

    // Should return 0 since -5 and -10 are not allowed //
    total = ticket.calculateTotal(-5, -10);
    assertEquals(0, total);

    // Should return 0 since -5 is not allowed //
    total = ticket.calculateTotal(-5, 5);
    assertEquals(0, total);

    // Should return 0 since -5 and 100 is not allowed //
    total = ticket.calculateTotal(-5, 100);
    assertEquals(0, total);

    // Should return 0 since -10 is not allowed //
    total = ticket.calculateTotal(5, -10);
    assertEquals(0, total);

    // Should return 0 since -10 and 50001 are not allowed //
    total = ticket.calculateTotal(50001, -10);
    assertEquals(0, total);

    // Should return 2000, since the passed arguments are 1000 for price and 2 for quantity
    // 1000 * 2 = 2000
    total = ticket.calculateTotal(1000, 2);
    assertEquals(2000, total);

    // Should return 0 since 50001 and 100 are not allowed //
    total = ticket.calculateTotal(50001, 100);
    assertEquals(0, total);

    // Should return 0 since 50001 is not allowed //
    total = ticket.calculateTotal(50001, 10);
    assertEquals(0, total);

    // Should return 0 since 100 is not allowed //
    total = ticket.calculateTotal(5, 100);
    assertEquals(0, total);
  }

  /** Below are the negative (exception) tests. */
  @Test
  void exceptionTest1() {
    login.txtuser.setText("");
    login.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> login.jButton1ActionPerformed(null));
    assertEquals("Username or Password Blank", exception.getMessage());
  }

  @Test
  void exceptionTest2() {
    login.txtuser.setText("");
    login.txtpass.setText("123");
    Exception exception = assertThrows(Exception.class, () -> login.jButton1ActionPerformed(null));
    assertEquals("Username or Password Blank", exception.getMessage());
  }

  @Test
  void exceptionTest3() {
    login.txtuser.setText("john");
    login.txtpass.setText("");
    Exception exception = assertThrows(Exception.class, () -> login.jButton1ActionPerformed(null));
    assertEquals("Username or Password Blank", exception.getMessage());
  }

  @Test
  void exceptionTest4() throws Exception {
    login.txtuser.setText("john");
    login.txtpass.setText("123");
    assertTrue(login.jButton1ActionPerformed(null));
  }

  /** Tests the amount of time that it takes a user to login. */
  @Test
  void testLoginTime() {
    assertFalse(login.testLogin("john", "123"));
  }
}
