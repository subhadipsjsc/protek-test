package people;
import java.util.Date;

public class ProductionWorker extends Employee  {

    private int shift;
    private double hourlyPayRate;

    // Constructors
    public ProductionWorker(String employeeName, String employeeNumber, Date hireDate, int shift, double hourlyPayRate) {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        this.hourlyPayRate = hourlyPayRate;
    }

    // Accessor methods
    public int getShift() {
        return shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    // Mutator methods
    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
