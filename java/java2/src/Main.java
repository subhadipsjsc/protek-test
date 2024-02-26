import people.ProductionWorker;

public class Main {
    public static void main(String[] args) {
       try {
            ProductionWorker worker = new ProductionWorker("Subhadip", "123-E", "2024-02-26", 1, 50.00);
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