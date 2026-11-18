
# PROG6112 Past Paper 2025 – Practice Solutions

**Student:** Adrian Gilau (ST10438081)
**Module:** Programming 1B (PROG6112)
**Paper:** PROG6112 Examination 2025 (100 marks: General Requirements 10, Question 1 30, Question 2 60)

## Repository structure

```text
PROG6112PastPaper2025/
├── ProductSalesReport/   Question 1 – console report (package st10438081group2.productsalesreport)
├── ProductSalesApp/      Question 2 – GUI application (package st10438081group2.productsalesapp)
└── README.md
```

Each folder is a separate NetBeans **Java with Maven** project (JDK 17 or later) with its own JUnit 5 tests.

## How to run

1. In NetBeans, **File > Open Project** and open `ProductSalesReport` and `ProductSalesApp`.
2. Run a project with **F6** (Run Project).
3. Run its tests with **Alt+F6** (Test Project), or right-click a test file > **Test File** (Ctrl+F6).

## Question 1 – Product sales report (30 marks)

A console application that stores the quarter and year names in single-dimensional arrays and the sales in a two-dimensional array (rows = years, columns = quarters), then prints the data in rows and columns followed by the total, average, maximum and minimum sales.

| File | Purpose | Paper |
| --- | --- | --- |
| `IProduct.java` | Interface copied from the paper (the text says IProductSales; the printed code and rubric say IProduct) | Q.1.2 |
| `ProductSales.java` | Implements `IProduct`: `TotalSales`, `AverageSales`, `MaxSale`, `MinSale` | Q.1.2 |
| `ProductSalesReport.java` | Main class: arrays and the formatted report | Q.1.1 |
| `ProductSalesTest.java` | Unit tests | Q.1.3 |

**Output**

```text
PRODUCT SALES REPORT - 2025
--------------------------------------------
            QUARTER 1  QUARTER 2  QUARTER 3
YEAR 1            300        150        700
YEAR 2            250        200        600
--------------------------------------------
Total sales:    2200
Average sales:  367
Maximum sale:   700
Minimum sale:   150
--------------------------------------------
```

**Unit tests**

| Test | Expected |
| --- | --- |
| `CalculateTotalSales_ReturnsTotalSales` | 2200 |
| `AverageSales_ReturnsAverageProductSales` | 366.67 (delta 0.01) |

## Question 2 – Product Sales Application (60 marks)

A Java Swing GUI for a sound equipment retailer. It displays the total sales, the average sales and the number of sales over and under the sales limit. The limit of **500** is stored as a constant; a sale is over the limit if it is **greater than 500**, otherwise it is under. The number of years processed is worked out from the array (number of rows) and shown in a read-only label.

| File | Purpose | Paper |
| --- | --- | --- |
| `IProductSales.java` | Interface copied from the paper | Q.2.4 |
| `ProductSales.java` | Implements `IProductSales`; stores the data; `SALES_LIMIT` constant | Q.2.4 |
| `ProductSalesForm.java` | Buttons, read-only text area and label, menu system, Load, Save, Clear | Q.2.1–Q.2.3 |
| `ProductSalesApp.java` | Main class: opens the form | – |
| `ProductSalesTest.java` | Unit tests | Q.2.5 |

**Using the application**

| Control | Action |
| --- | --- |
| **Load Product Data** button / **Tools > Load Product Data** | Calculates and displays the results and the years processed |
| **Save Product Data** button / **Tools > Save Product Data** | Saves the text area to `data.txt` in the project folder |
| **Tools > Clear** | Empties the text area and clears the Years Processed label |
| **File > Exit** | Closes the application |

The menu items call the same methods as the buttons, so no logic is duplicated.

**Text area after Load** (label: `Years Processed: 2`)

```text
Total Sales: 2200
Average Sales: 367
Sales over limit: 2
Sales under limit: 4
```

**data.txt after Save**

```text
DATA LOG
******************************
Total Sales: 2200
Average Sales: 367
Sales over limit: 2
Sales under limit: 4
******************************
```

**Unit tests**

| Test | Expected |
| --- | --- |
| `GetSalesOverLimit_ReturnsNumberOfSales` | 2 (700 and 600) |
| `GetSalesUnderLimit_ReturnsNumberOfSales` | 4 (6 sales − 2 over the limit) |

## General Requirements checklist (10 marks)

- [x] Good programming practice: correct types (`int` totals and counts, `double` averages), private fields, constants in CAPITALS, PascalCase interface methods as given, camelCase for own methods, prefixed control names (`btn`, `txt`, `lbl`, `mnu`).
- [x] Code efficiency: buttons and menu items share one method each; "under" reuses "over"; one counting helper.
- [x] Comments: a header comment on every class and a comment on every method and logic block.
- [x] Programs compile and execute; all four unit tests pass.

## AI disclosure

Claude (Anthropic, 2026) was used before the exam to prepare study notes, practice memos and code templates. The code in this repository was typed and tested by me.

## How to cite this repository

Gilau, A., 2026a. PROG6112PastPaper2025 [Source code] Available at: <https://github.com/MattGilau/PROG6112PastPaper2025> [Accessed 18 November 2026].

In-text: (Gilau, 2026a)

## Reference list

Anthropic, 2026. Claude (Opus 5.5) [Computer program] Available at: <https://claude.ai> [Accessed 18 November 2026].

Farrell, J., 2023. *Java programming*. 10th ed. Boston: Cengage.

JUnit, [s.a.]. JUnit 5 user guide. [online] Available at: <https://junit.org/junit5/docs/current/user-guide/> [Accessed 18 November 2026].

Oracle, [s.a.a]. How to use menus. [online] Available at: <https://docs.oracle.com/javase/tutorial/uiswing/components/menu.html> [Accessed 18 November 2026].

Oracle, [s.a.b]. Class JTextArea (Java Platform SE 8). [online] Available at: <https://docs.oracle.com/javase/8/docs/api/javax/swing/JTextArea.html> [Accessed 18 November 2026].