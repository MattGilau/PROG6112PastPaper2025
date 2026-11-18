package st10438081group2.productsalesapp;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Product Sales Application form (2025 exam, Q.2.1 - Q.2.3). - Two buttons load
 * and save the product data (Q.2.1). - A read-only text area displays the
 * results and a read-only label displays the number of years processed (Q.2.1,
 * Q.2.2). - Save writes the text area to data.txt in the sample format (Q.2.2).
 * - A File menu (Exit) and a Tools menu (Load Product Data, Save Product Data,
 * Clear) are provided; the menu items call the SAME methods as the buttons, so
 * no logic is duplicated (Q.2.3).
 *
 * Techniques used: - extending JFrame and implementing ActionListener, with
 * getSource() to find which control was clicked (Farrell, 2023, pp.557,
 * 563-567); - BorderLayout and GridLayout to place the controls (Farrell, 2023,
 * p.555); - JMenuBar, JMenu and JMenuItem, which are not covered in the
 * textbook (Oracle, s.a.a); - JTextArea set to read-only with
 * setEditable(false) (Oracle, s.a.b); - writing a text file with BufferedWriter
 * inside try-catch (Farrell, 2023, pp.397, 457-458).
 *
 * References: Farrell, J., 2023. Java programming. 10th ed. Boston: Cengage.
 * Oracle, [s.a.a]. How to use menus. [online] Available at:
 * <https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html>
 * [Accessed 18 November 2026]. Oracle, [s.a.b]. Class JTextArea (Java Platform
 * SE 8). [online] Available at:
 * <https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextArea.html>
 * [Accessed 18 November 2026].
 *
 * AI disclosure: Claude (Anthropic, 2026) was used before the exam to prepare
 * study notes and practice code. This file was typed and tested by me.
 * Anthropic, 2026. Claude (Opus 5.5) [Computer program] Available at:
 * <https://claude.ai> [Accessed 18 November 2026].
 *
 * @author adria
 */
public class ProductSalesForm extends JFrame implements ActionListener {

    // ---------- data and constants ----------
    // the product sales data "in memory": rows = years,
    // columns = Microphone, Speakers, Mixing Desk
    private static final int[][] SALES_DATA = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // file name and layout lines, exactly as in the paper's sample
    private static final String FILE_NAME = "data.txt";
    private static final String FILE_HEADING = "DATA LOG";
    private static final String STARS = "******************************";
    private static final String YEARS_LABEL = "Years Processed: ";

    // ---------- form controls (btn = button, txt = text area, lbl = label, mnu = menu item) ----------
    private final JButton btnLoad = new JButton("Load Product Data");
    private final JButton btnSave = new JButton("Save Product Data");
    private final JTextArea txtResults = new JTextArea(6, 24);
    private final JLabel lblYearsProcessed = new JLabel(YEARS_LABEL);

    private final JMenuItem mnuExit = new JMenuItem("Exit");
    private final JMenuItem mnuLoad = new JMenuItem("Load Product Data");
    private final JMenuItem mnuSave = new JMenuItem("Save Product Data");
    private final JMenuItem mnuClear = new JMenuItem("Clear");

    /**
     * Constructor: builds the window, the menu bar and the controls, and
     * registers this form as the listener for every button and menu item.
     */
    public ProductSalesForm() {
        super("Product Sales Application");                // window title from the sample
        setSize(340, 330);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));

        // menu bar: File > Exit ; Tools > Load Product Data, Save Product Data, Clear
        JMenuBar menuBar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
        JMenu mnuTools = new JMenu("Tools");
        mnuFile.add(mnuExit);
        mnuTools.add(mnuLoad);
        mnuTools.add(mnuSave);
        mnuTools.add(mnuClear);
        menuBar.add(mnuFile);
        menuBar.add(mnuTools);
        setJMenuBar(menuBar);

        // two buttons stacked at the top, as in the sample screenshot
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        buttonPanel.add(btnLoad);
        buttonPanel.add(btnSave);
        add(buttonPanel, BorderLayout.NORTH);

        // text area in the middle: read-only output, inside a scroll pane
        txtResults.setEditable(false);
        add(new JScrollPane(txtResults), BorderLayout.CENTER);

        // label at the bottom: a JLabel cannot be typed into, so it is read-only
        add(lblYearsProcessed, BorderLayout.SOUTH);

        // the form listens to every button and menu item
        btnLoad.addActionListener(this);
        btnSave.addActionListener(this);
        mnuExit.addActionListener(this);
        mnuLoad.addActionListener(this);
        mnuSave.addActionListener(this);
        mnuClear.addActionListener(this);
    }

    /**
     * One place decides which shared method runs for each click. The Load and
     * Save menu items call the same methods as the buttons (Q.2.3).
     *
     * @param e the click event; getSource() returns the control clicked
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btnLoad || source == mnuLoad) {
            loadProductData();
        } else if (source == btnSave || source == mnuSave) {
            saveProductData();
        } else if (source == mnuClear) {
            clearForm();
        } else if (source == mnuExit) {
            System.exit(0);                                 // close the application
        }
    }

    // ---------- shared methods (Section 5) ----------
    /**
     * Load: calculate the results and display them (Section 5).
     */
    private void loadProductData() {
        // TODO Section 5
    }

    /**
     * Save: write the text area to data.txt (Section 5).
     */
    private void saveProductData() {
        // TODO Section 5
    }

    /**
     * Clear: empty the text area and the label (Section 5).
     */
    private void clearForm() {
        // TODO Section 5
    }
}
