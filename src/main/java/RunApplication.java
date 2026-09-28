/**
 *
 * @author Vutlharhi.
 */

import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the console device type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String consoleType = "";
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                consoleType = "Unknown";
                break;
        }

        System.out.print("Enter the store: ");
        String storeName = scanner.nextLine();

        System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
        int totalSales = scanner.nextInt();

        // Instantiate ConsoleSales object
        ConsoleSales salesReport = new ConsoleSales(consoleType, storeName, totalSales);

        // Display report
        salesReport.printReport();

        scanner.close();
    }
}