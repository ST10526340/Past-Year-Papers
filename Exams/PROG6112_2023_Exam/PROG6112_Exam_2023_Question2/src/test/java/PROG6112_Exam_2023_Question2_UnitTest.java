/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_exam_2023_question2.Data;
import com.mycompany.prog6112_exam_2023_question2.EstateAgent;
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
public class PROG6112_Exam_2023_Question2_UnitTest {

    public PROG6112_Exam_2023_Question2_UnitTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void CalculateCommission_CalculatedSuccessfully() {

       // String location = "Durban";
        //String name = "John Doe";
        int price = 1500000;
        int commission = 10;
        //Data data = new Data(location, name, price, commission);
        EstateAgent agent = new EstateAgent();
        //  Data data = new Data(location, name, price, commission);
        double actual = agent.CalculateCommission(Integer.toString(price), Integer.toString(commission));
        double theoretical = 1500000 * 0.10;
        assertEquals(actual, theoretical);

    }

    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() {
        //  String location = "Durban";
        //String name = "John Doe";
        int price = 1500000;
        int commission = 10;
        //  Data data = new Data(location, name, price, commission);
        EstateAgent agent = new EstateAgent();

        double actual = agent.CalculateCommission(Integer.toString(price), Integer.toString(commission));
        double theoretical = 20;
        assertFalse(actual == theoretical);
    }

    @Test
    public void Validation() {
        String location = "Durban";
        String name = "John Doe";
        int price = 1500000;
        int commission = 10;
        Data data = new Data(location, name, price, commission);
        EstateAgent agent = new EstateAgent();
        assertTrue(agent.ValidateData(data));

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
