package st10438081group2.productsalesreport;

/**
 * Interface given in the 2025 exam paper (Q.1.2), copied exactly as printed.
 * Note: the paper's text calls it "IProductSales", but the printed code and the
 * rubric use IProduct, so IProduct is used here. An interface only says WHAT
 * methods exist; the implementing class (ProductSales) says HOW they work
 * (Farrell, 2023, p.371).
 *
 * References: Farrell, J., 2023. Java programming. 10th ed. Boston: Cengage.
 *
 * @author adria
 */
public interface IProduct {

    int TotalSales(int[][] productSales);

    double AverageSales(int[][] productSales);

    int MaxSale(int[][] productSales);

    int MinSale(int[][] productSales);
}
