package st10438081group2.productsalesapp;

/**
 * ProductSales stores the sound equipment retailer's sales data and performs
 * the calculations required by the IProductSales interface (2025 exam, Q.2.4).
 * The 2D array has one row per year and one column per product (Microphone,
 * Speakers, Mixing Desk).
 *
 * Techniques used: - implementing an interface with @Override (Farrell, 2023,
 * pp.337, 371); - a private field set through a constructor using "this"
 * (Farrell, 2023, pp.126, 131-134); - a static final constant for the sales
 * limit (Farrell, 2023, p.140); - nested for loops over a 2D array and .length
 * (Farrell, 2023, pp.220, 300-303).
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
public class ProductSales implements IProductSales {

    // The sales limit (500) used to decide if a product is successful,
    // stored once as a constant so it is easy to change
    public static final int SALES_LIMIT = 500;

    // The sales data: private so it can only be reached through the getter
    private final int[][] productSales;

    /**
     * Constructor: receives the sales data and stores it in the field.
     *
     * @param productSales the sales figures, one row per year
     */
    public ProductSales(int[][] productSales) {
        this.productSales = productSales;
    }

    /**
     * @return the sales data stored in this object
     */
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    /**
     * Adds every sales figure in the 2D array.
     *
     * @return the total of all sales
     */
    @Override
    public int GetTotalSales() {
        int total = 0;
        // outer loop picks a year (row), inner loop walks its products (columns)
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                total += productSales[row][col];
            }
        }
        return total;
    }

    /**
     * Counts the sales that are over the limit (GREATER THAN 500).
     *
     * @return the number of sales above SALES_LIMIT
     */
    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int row = 0; row < productSales.length; row++) {
            for (int col = 0; col < productSales[row].length; col++) {
                if (productSales[row][col] > SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Counts the sales that are under the limit. Every sale is either over the
     * limit or not, so the over-limit method is reused instead of repeating the
     * loop (code efficiency).
     *
     * @return the number of sales at or below SALES_LIMIT
     */
    @Override
    public int GetSalesUnderLimit() {
        return countSales() - GetSalesOverLimit();
    }

    /**
     * The number of years processed is the number of rows in the array. It is
     * worked out from the array, not typed in as a fixed value. The label on
     * the form shows this as "Years Processed".
     *
     * @return the number of years processed
     */
    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }

    /**
     * Average = total / number of sales. The total is cast to double first so
     * that the division is not integer division (Farrell, 2023, p.595).
     *
     * @return the average sale (not rounded; the form rounds it)
     */
    @Override
    public double GetAverageSales() {
        return (double) GetTotalSales() / countSales();
    }

    /**
     * Helper method so the counting loop is only written once.
     *
     * @return how many sales figures are in the array
     */
    private int countSales() {
        int count = 0;
        for (int row = 0; row < productSales.length; row++) {
            count += productSales[row].length;
        }
        return count;
    }
}
