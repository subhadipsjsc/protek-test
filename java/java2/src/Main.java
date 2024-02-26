import people.ProductionWorker;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date hireDate = new Date();
        ProductionWorker productionWorker = new ProductionWorker("John Doe", "123-A", hireDate, 1, 15.50);

        // Display information
        System.out.println("Employee Name: " + productionWorker.getEmployeeName());
        System.out.println("Employee Number: " + productionWorker.getEmployeeNumber());
        System.out.println("Hire Date: " + productionWorker.getHireDate());
        System.out.println("Shift: " + productionWorker.getShift());
        System.out.println("Hourly Pay Rate: $" + productionWorker.getHourlyPayRate());
    }
}