package CompanyExample;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private double monthlyHours;
    private double hourlyWage;
    public HourlyEmployee(String name, LocalDate hireDate) {
        this(name, hireDate,200.0,20.0);
    }

    @Override
    public double mounthlyPay() {
        return hourlyWage*monthlyHours;
    }

    public HourlyEmployee(String name, LocalDate hireDate, double monthlyHours, double hourlyWage) {
        super(name, hireDate);
        Utils.disallowZeroAndNegatives(monthlyHours,hourlyWage);
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

}
