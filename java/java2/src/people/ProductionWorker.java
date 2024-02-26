package people;
import java.util.Date;

public class ProductionWorker extends Employee  {

    private int shift; // 1 for day, 2 for night
    private double hourlyPayRate;

    // Constructor with all arguments
    public ProductionWorker(String name, String employeeNumber, String hireDate, int shift, double hourlyPayRate) throws IllegalArgumentException {
        super(name, employeeNumber, hireDate);
        if (shift < 1 || shift > 2) {
            throw new IllegalArgumentException("Invalid shift number. Must be 1 (day) or 2 (night).");
        }
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    // Getters and Setters
    public int getShift() {
        return shift;
    }

    public void setShift(int shift) throws IllegalArgumentException {
        if (shift < 1 || shift > 2) {
            throw new IllegalArgumentException("Invalid shift number. Must be 1 (day) or 2 (night).");
        }
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
