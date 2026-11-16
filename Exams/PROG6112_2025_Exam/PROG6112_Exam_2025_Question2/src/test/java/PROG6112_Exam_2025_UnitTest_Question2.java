/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_exam_2025_question2.productSales;
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
public class PROG6112_Exam_2025_UnitTest_Question2 {

    public PROG6112_Exam_2025_UnitTest_Question2() {
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
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        int[][] sales = {{300, 150, 700}, {250, 200, 600}};
        int numProducts = 3;
        productSales product = new productSales(sales, numProducts);
        int actutal = product.GetSalesOverLimit();
        int theoretical = 2;
        assertEquals(actutal, theoretical);

    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        int[][] sales = {{300, 150, 700}, {250, 200, 600}};
        int numProducts = 3;
        productSales product = new productSales(sales, numProducts);
        int actual = product.GetSalesUnderLimit();
        int theoretical = 4;

        assertEquals(actual, theoretical);

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
