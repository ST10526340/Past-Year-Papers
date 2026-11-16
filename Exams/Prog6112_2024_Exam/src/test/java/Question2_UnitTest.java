/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_2024_exam.MovieTickets;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER-PC
 */
public class Question2_UnitTest {

    public Question2_UnitTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        int numtickets = 3;
        double ticketPrice = 20;
        String movieName = "Oppenheimer";
        MovieTickets q2 = new MovieTickets(numtickets, ticketPrice, movieName);
        double expected = (60) * 1.14;
        double actual = q2.CalculateTotalTicketPrice(numtickets, ticketPrice);
        assertEquals(actual, expected);

    }

    @Test
    public void Validation_PASS() {
        int numtickets = 3;
        double ticketPrice = 20;
        String movieName = "Oppenheimer";
        MovieTickets q2 = new MovieTickets(numtickets, ticketPrice, movieName);
        boolean actual = q2.fullCheck();
        assertTrue(actual);

    }

    @Test
    public void Validation_FAIL() {
        int numtickets = 3;
        double ticketPrice = 20;
        String movieName = "";
        MovieTickets q2 = new MovieTickets(numtickets, ticketPrice, movieName);
        boolean actual = q2.fullCheck();
        assertFalse(actual);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
