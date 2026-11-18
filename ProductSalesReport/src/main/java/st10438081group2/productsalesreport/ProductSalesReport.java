package st10438081group2.productsalesreport;

/**
 * Prints the product sales report for a local retail company (2025 exam,
 * Q.1.1). The year and quarter names are stored in single-dimensional arrays
 * and the sales in a two-dimensional array (rows = years, columns = quarters).
 * The report prints the data in rows and columns, followed by the total,
 * average, maximum and minimum sales for the two-year period.
 *
 * Techniques used: - declaring and populating 1D and 2D arrays (Farrell, 2023,
 * pp.267-271, 300); - nested for loops to print rows and columns (Farrell,
 * 2023, p.220); - printf format specifiers to align the columns (Farrell, 2023,
 * p.597); - Math.round to round the average to a whole number (Farrell, 2023,
 * pp.141-144).
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
public class ProductSalesReport {

    public static void main(String[] args) {

        // 1D arrays: column headings (quarters) and row labels (years)
        String[] quarters = {"QUARTER 1", "QUARTER 2", "QUARTER 3"};
        String[] years = {"YEAR 1", "YEAR 2"};

        // 2D array: rows = years, columns = quarters (data from the paper's table)
        int[][] productSales = {
            {300, 150, 700}, // row 0 = Year 1
            {250, 200, 600} // row 1 = Year 2
        };

        // object that does the calculations (Section 2)
        ProductSales sales = new ProductSales();

        // report title and dashed line
        String line = "--------------------------------------------";
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println(line);

        // heading row: an empty 10-wide cell, then each quarter right-aligned in 11
        System.out.printf("%-10s", "");
        for (int col = 0; col < quarters.length; col++) {
            System.out.printf("%11s", quarters[col]);
        }
        System.out.println();

        // data rows: year label left-aligned, sales right-aligned under the headings
        for (int row = 0; row < productSales.length; row++) {
            System.out.printf("%-10s", years[row]);
            for (int col = 0; col < productSales[row].length; col++) {
                System.out.printf("%11d", productSales[row][col]);
            }
            System.out.println();
        }

        // summary lines: labels left-aligned in 16 so the numbers line up
        System.out.println(line);
        System.out.printf("%-16s%d%n", "Total sales:", sales.TotalSales(productSales));
        // the average (366.67) is rounded to a whole number when printed: 367
        System.out.printf("%-16s%d%n", "Average sales:", Math.round(sales.AverageSales(productSales)));
        System.out.printf("%-16s%d%n", "Maximum sale:", sales.MaxSale(productSales));
        System.out.printf("%-16s%d%n", "Minimum sale:", sales.MinSale(productSales));
        System.out.println(line);
    }
}
