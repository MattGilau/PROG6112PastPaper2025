package st10438081group2.productsalesapp;

/**
 * Main class for Question 2 (2025 exam). NetBeans runs this class with F6; it
 * opens the Product Sales Application form in the centre of the screen.
 *
 * @author adria
 */
public class ProductSalesApp {

    public static void main(String[] args) {
        ProductSalesForm form = new ProductSalesForm();
        form.setLocationRelativeTo(null);   // centre the window on the screen
        form.setVisible(true);              // show the form
    }
}
