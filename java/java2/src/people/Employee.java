package people;

import java.util.Date;

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private Date hireDate;

    // Constructors
    public Employee(String employeeName, String employeeNumber, Date hireDate) {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        this.hireDate = hireDate;
    }

    // Accessor methods
    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public Date getHireDate() {
        return hireDate;
    }

    // Mutator methods
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "employeeName=" + employeeName +
                ", employeeNumber=" + employeeNumber +
                ", hireDate=" + hireDate +
                '}';
    }
}
