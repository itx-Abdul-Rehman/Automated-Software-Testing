import java.util.Scanner;
public class Main {
    // Function to calculate Net Profit
    public static double calculateNetProfit(double initialInvestment, double[] cashInflows, double
            salvageValue) {
        double totalCashInflows = 0;
        for (double inflow : cashInflows) {
            totalCashInflows += inflow;
        }
        return totalCashInflows + salvageValue - initialInvestment;
    }

    // Function to calculate Payback Period
    public static double calculatePaybackPeriod(double initialInvestment, double[] cashInflows) {
        double cumulativeCashFlow = 0;
        for (int i = 0; i < cashInflows.length; i++) {
            cumulativeCashFlow += cashInflows[i];
            if (cumulativeCashFlow >= initialInvestment) {
                return i + 1 - (cumulativeCashFlow - initialInvestment) / cashInflows[i];
            }
        }
        return -1; // Return -1 if payback period is not achieved
    }

    // Function to calculate ROI
    public static double calculateROI(double initialInvestment, double netProfit) {
        return (netProfit / initialInvestment) * 100;
    }

    // Function to calculate NPV
    public static double calculateNPV(double initialInvestment, double[] cashInflows, double
            discountRate) {
        double npv = -initialInvestment;
        for (int i = 0; i < cashInflows.length; i++) {
            npv += cashInflows[i] / Math.pow(1 + discountRate, i + 1);
        }
        return npv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// User input for Initial Investment
        System.out.print("Enter the initial investment: ");
        double initialInvestment = scanner.nextDouble();
// User input for number of years and annual cash inflows
        System.out.print("Enter the number of years: ");
        int years = scanner.nextInt();
        double[] cashInflows = new double[years];
        for (int i = 0; i < years; i++) {
            System.out.print("Enter the cash inflow for year " + (i + 1) + ": ");
            cashInflows[i] = scanner.nextDouble();
        }
// User input for discount rate
        System.out.print("Enter the discount rate (as a decimal): ");
        double discountRate = scanner.nextDouble();
// User input for salvage value (optional)
        System.out.print("Enter the salvage value (if any, or enter 0): ");
        double salvageValue = scanner.nextDouble();
// Calculate Net Profit
        double netProfit = calculateNetProfit(initialInvestment, cashInflows, salvageValue);
// Calculate Payback Period
        double paybackPeriod = calculatePaybackPeriod(initialInvestment, cashInflows);
// Calculate ROI
        double roi = calculateROI(initialInvestment, netProfit);
// Calculate NPV
        double npv = calculateNPV(initialInvestment, cashInflows, discountRate);
// Display results
        System.out.println("\n--- Cost-Benefit Analysis Results ---");
        System.out.printf("Net Profit: $%.2f\n", netProfit);
        if (paybackPeriod != -1) {
            System.out.printf("Payback Period: %.2f years\n", paybackPeriod);
        } else {
            System.out.println("Payback Period: Not achieved within the given timeframe.");
        }
        System.out.printf("Return on Investment (ROI): %.2f%%\n", roi);
        System.out.printf("Net Present Value (NPV): $%.2f\n", npv);
        scanner.close();
    }
}