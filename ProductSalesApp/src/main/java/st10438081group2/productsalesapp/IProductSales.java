package st10438081group2.productsalesapp;

/**
 * Interface given in the 2025 exam paper (Q.2.4), copied exactly as printed. It
 * lists the methods the ProductSales class must provide. The Get methods take
 * no parameters because the ProductSales class stores the data itself. An
 * interface only says WHAT methods exist; the implementing class says HOW they
 * work (Farrell, 2023, p.371).
 *
 * Note: GetProductsProcessed() returns the number of YEARS processed (rows of
 * the array), because the form's label shows "Years Processed" (Q.2.1, Q.2.2).
 *
 * References: Farrell, J., 2023. Java programming. 10th ed. Boston: Cengage.
 *
 * @author adria
 */
public interface IProductSales {

    int[][] GetProductSales();

    int GetTotalSales();

    int GetSalesOverLimit();

    int GetSalesUnderLimit();

    int GetProductsProcessed();

    double GetAverageSales();
}
