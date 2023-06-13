package CompanyExample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Company {
    ArrayList<Employee> employees = new ArrayList<>();

    public Company(){
        employees.add(new HourlyEmployee("Ali", LocalDate.of(2010,10,10)));
        employees.add(new HourlyEmployee("Kemal", LocalDate.of(2012,10,10)));
        employees.add(1,new SalariedEmployee("Fatma", LocalDate.of(2014,1,1),125.54));
    }

    public double monthlyPayroll(){
        double payroll = 0.0;
        for(Employee employee:employees)
            payroll += employee.mounthlyPay();
        return payroll;
    }

    public void printEmployees(){
        for(Employee employee:employees)
            System.out.println(employee.toString());
    }

    public void sort(){
        Collections.sort(employees);
    }
    public static void main(String[] args) {

    }
}
