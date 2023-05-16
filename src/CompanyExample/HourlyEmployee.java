package CompanyExample;

import java.time.LocalDate;
/**
public class HourlyEmployee extends Employee{
    private double monthlyHours;
    private double hourlyWage;
    public HourlyEmployee(String name, LocalDate hireDate) {
        this(name, hireDate,200.0,20.0);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double monthlyHours, double hourlyWage) {
        super(name, hireDate);
        disallowZeroAndNegatives(monthlyHours,hourlyWage);
        this.monthlyHours = monthlyHours;
        this.hourlyWage = hourlyWage;
    }

    public double getMonthlyHours() {
        return monthlyHours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }
    // burada eğer toString methodu olmasaydı bir üst sınıfındakini çağıracaktı
    // dynamic binding
    @Override
    public String toString(){
        return super.toString() + " " + monthlyHours + " " + hourlyWage;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public double monthlyPay(){
        return hourlyWage*monthlyHours;
    }
    public void disallowZeroAndNegatives(double ... args){
        for(double arg:args)
            if(arg <= 0)
                throw new IllegalArgumentException("Zero or Negative Argument");
    }
}
**/