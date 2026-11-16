/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.prog6112_2024_exam.Prog6112_2024_Exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author USER-PC
 */
public class MoviesUnitTest_Exam_2024 {

    public MoviesUnitTest_Exam_2024() {
    }

    @Test
    public static void CalculateTotalSales_ReturnsExpectedTotalSales() {
        Prog6112_2024_Exam main = new Prog6112_2024_Exam();
        int[] movieTicketSales = {3000, 1500, 1700};
        int actual = main.totalMovieSales(movieTicketSales);
        int theoretical = 3000 + 1500 + 1700;
        assertEquals(actual, theoretical);

    }//

    @Test
    public static void TopMovieSales_ReturnsTopMovie() {
        Prog6112_2024_Exam main = new Prog6112_2024_Exam();
        String movies[] = {"Openheimer", "Napoleon"};
        int totalSales[] = {3500 + 1200 + 1600, 3000 + 1500 + 1700};
        String actual = main.TopMovie(movies, totalSales);
        String theoretical = "Openheimer";
        assertEquals(actual, theoretical);

    }//

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
