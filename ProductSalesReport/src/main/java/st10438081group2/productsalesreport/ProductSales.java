package st10438081group2.productsalesreport;

/**
 * ProductSales implements the IProduct interface (2025 exam, Q.1.2). It
 * contains separate methods to calculate the total, average, maximum and
 * minimum product sales from a 2D array (rows = years, columns = quarters). The
 * data is passed in as a parameter, so the class needs no fields.
 *
 * Techniques used: - implementing an interface with @Override (Farrell, 2023,
 * pp.337, 371); - passing an array to a method (Farrell, 2023, p.289); - nested
 * for loops over a 2D array using .length (Farrell, 2023, pp.220, 300-303); -
 * casting to double to avoid integer division (Farrell, 2023, p.595).
 *
 * References: Farrell, J., 2023. Java programming. 10th ed. Boston: Cengage.
 *
 * AI disclosure: Claude (Anthropic, 2026) was used before the exam to prepare
 * study notes and practice code. This file was typed and tested by me.
 * Anthropic, 2026. Claude (Opus 5.5) [Computer program] Available at:
 * <https://claude.ai> [Accessed 18 November 2026].
 *
 * @author adria
 */
public class ProductSales implements IProduct {

    /**
     * Adds every value in the 2D array.
     *
     * @param productSales the sales data, one row per year
     * @return the total sales for the two-year period
     */
    @Override
    public int TotalSales(int[][] productSales) {
        int total = 0;
        // outer loop picks a year (row), inner loop walks its quarters (columns)
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
            }
        }
        return total;
    }

    /**
     * Average = total / number of values.
     *
     * @param productSales the sales data, one row per year
     * @return the average sale (not rounded; the report rounds it)
     */
    @Override
    public double AverageSales(int[][] productSales) {
        // count how many values are in the array
        int count = 0;
        for (int row = 0; row < productSales.length; row++) {
            count += productSales[row].length;
        }
        // cast to double so 2200 / 6 gives 366.67 and not 366
        return (double) TotalSales(productSales) / count;
    }

    /**
     * Finds the maximum: start with the first value and replace it whenever a
     * larger value is found.
     *
     * @param productSales the sales data, one row per year
     * @return the largest single sale
     */
    @Override
    public int MaxSale(int[][] productSales) {
        int max = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > max) {
                    max = productSales[row][col];
                }
            }
        }
        return max;
    }

    /**
     * Finds the minimum: start with the first value and replace it whenever a
     * smaller value is found.
     *
     * @param productSales the sales data, one row per year
     * @return the smallest single sale
     */
    @Override
    public int MinSale(int[][] productSales) {
        int min = productSales[0][0];
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] < min) {
                    min = productSales[row][col];
                }
            }
        }
        return min;
    }
}
