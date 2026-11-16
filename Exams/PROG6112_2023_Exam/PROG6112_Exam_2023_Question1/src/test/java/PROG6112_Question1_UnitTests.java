/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_exam_2023_question1.EstateAgent;
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
public class PROG6112_Question1_UnitTests {

    public PROG6112_Question1_UnitTests() {
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
    public void CalculateTotalSales_ReturnsTotalSales() {
        double[] propertySales = {100000, 100000, 100000};
        double[] propertyTotals = {500000, 1000000};
        String Agents = "Doe";
        EstateAgent agent = new EstateAgent(propertySales, Agents, propertyTotals);
        double actual = agent.calcAgentSales();
        double theoretical = 300000;
        assertEquals(actual, theoretical);

    }

    @Test
    public void CalculateTotalCommission_ReturnsCommission() {
        double[] propertySales = {100000, 100000, 100000};
        double[] propertyTotals = {500000, 1000000};
        String Agents = "Doe";
        EstateAgent agent = new EstateAgent(propertySales, Agents, propertyTotals);
        double actual = agent.calcCommission();
        double theoretical = 300000 * 0.02;
        assertEquals(actual, theoretical);

    }

    @Test
    public void TopAgent_ReturnsTopPosition() {
        double[] propertySales = {100000, 100000, 100000};
        double[] propertyTotals = {500000, 1000000};
        String Agents = "Doe";
        EstateAgent agent = new EstateAgent(propertySales, Agents, propertyTotals);
        int actual = agent.TopPerformer();
        int theoretical = 1000000;
        assertEquals(actual, theoretical);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
