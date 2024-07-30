public class FinancialForecasting {

    // Recursive method to calculate future value
    public double calculateFutureValue(double currentValue, double growthRate, int periods) {
        // Base case: no more periods to project
        if (periods == 0) {
            return currentValue;
        }
        // Recursive case: calculate future value for one less period
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, periods - 1);
    }

    // Iterative method to calculate future value
    public double calculateFutureValueIterative(double currentValue, double growthRate, int periods) {
        double futureValue = currentValue;
        for (int i = 0; i < periods; i++) {
            futureValue *= (1 + growthRate);
        }
        return futureValue;
    }

    public static void main(String[] args) {
        FinancialForecasting forecasting = new FinancialForecasting();
        
        double currentValue = 1000.0; // Initial amount
        double growthRate = 0.05; // Growth rate of 5%
        int periods = 10; // Forecasting 10 periods into the future

        // Using recursive method
        double futureValueRecursive = forecasting.calculateFutureValue(currentValue, growthRate, periods);
        System.out.println("Future Value (Recursive): $" + String.format("%.2f", futureValueRecursive));

        // Using iterative method
        double futureValueIterative = forecasting.calculateFutureValueIterative(currentValue, growthRate, periods);
        System.out.println("Future Value (Iterative): $" + String.format("%.2f", futureValueIterative));
    }
}
