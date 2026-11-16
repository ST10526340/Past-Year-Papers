/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_exam_2025.PROG6112_Exam_2025;
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
public class salesTest {

    public salesTest() {
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
        PROG6112_Exam_2025 main = new PROG6112_Exam_2025();
        int[][] productSales = {{100, 100, 100}, {100, 100, 100}};
        int actual = main.TotalSales(productSales);
        int theretical = 600;
        assertEquals(actual, theretical);

    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        PROG6112_Exam_2025 main = new PROG6112_Exam_2025();
        int[][] productSales = {{100, 100, 100}, {100, 100, 100}};
        double actual = main.AverageSales(productSales);
        double theretical = 100;
        assertEquals(actual, theretical);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
