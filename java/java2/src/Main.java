import people.ProductionWorker;

public class Main {
    public static void main(String[] args) {
       try {
            ProductionWorker worker = new ProductionWorker("John Doe", "123-C", "2023-10-26", 1, 25.00);
            System.out.println("Employee Name: " + worker.getName());
            System.out.println("Employee Number: " + worker.getEmployeeNumber());
            System.out.println("Hire Date: " + worker.getHireDate());
            System.out.println("Shift: " + (worker.getShift() == 1 ? "Day" : "Night"));
            System.out.println("Hourly Pay Rate: $" + worker.getHourlyPayRate());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}