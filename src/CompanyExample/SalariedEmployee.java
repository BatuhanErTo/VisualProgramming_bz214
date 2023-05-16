package CompanyExample;

import java.security.PublicKey;
import java.time.LocalDate;
/**
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

    public double monthlyPay(){
        return annualSalary/MONTH;
    }

    public void disallowZeroAndNegatives(double ... args){
        for(double arg:args)
            if(arg <= 0)
                throw new IllegalArgumentException("Zero or Negative Argument");
    }
}
**/