package CompanyExample;


import java.time.LocalDate;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private final static int MONTH = 12;

    public SalariedEmployee(String name, LocalDate hireDate, double annualSalary) {
        super(name, hireDate);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }
    @Override
    public double mounthlyPay() {
        return annualSalary/MONTH;
    }
}