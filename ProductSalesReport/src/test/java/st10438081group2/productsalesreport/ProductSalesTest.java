package st10438081group2.productsalesreport;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for the ProductSales class (2025 exam, Q.1.3). The test names are
 * copied exactly from the paper. assertEquals takes the expected value first
 * and the actual value second; a delta is used when comparing doubles (JUnit,
 * s.a.).
 *
 * References: JUnit, [s.a.]. JUnit 5 user guide. [online] Available at:
 * <https://junit.org/junit5/docs/current/user-guide/> [Accessed 18 November
 * 2026].
 *
 * @author adria
 */
public class ProductSalesTest {

    // the same data as the paper's table, so the expected answers are known
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // the object being tested
    private final ProductSales sales = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        // 300 + 150 + 700 + 250 + 200 + 600 = 2200
        assertEquals(2200, sales.TotalSales(productSales));
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        // 2200 / 6 = 366.666...; a double needs a delta (allowed difference)
        assertEquals(366.67, sales.AverageSales(productSales), 0.01);
    }
}
