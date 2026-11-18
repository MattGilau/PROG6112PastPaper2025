package st10438081group2.productsalesapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ProductSales class (2025 exam, Q.2.5). The test names are
 * copied exactly from the paper. assertEquals takes the expected value first
 * and the actual value second (JUnit, s.a.).
 *
 * References: JUnit, [s.a.]. JUnit 5 user guide. [online] Available at:
 * <https://junit.org/junit5/docs/current/user-guide/> [Accessed 18 November
 * 2026].
 *
 * @author adria
 */
public class ProductSalesTest {

    // the same data as the paper's table, so the expected answers are known
    private final int[][] salesData = {
        {300, 150, 700}, // year 1: Microphone, Speakers, Mixing Desk
        {250, 200, 600} // year 2
    };

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        ProductSales productSales = new ProductSales(salesData);
        // over 500: only 700 and 600 = 2 sales
        assertEquals(2, productSales.GetSalesOverLimit());
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        ProductSales productSales = new ProductSales(salesData);
        // 6 sales in total - 2 over the limit = 4 (300, 150, 250, 200)
        assertEquals(4, productSales.GetSalesUnderLimit());
    }
}
