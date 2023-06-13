package CompanyExample;

import java.time.LocalDate;

public abstract class Employee extends Object implements Comparable<Employee> {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        Utils.disallowNullArgs(name,hireDate);
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public abstract double mounthlyPay();
    public LocalDate getHireDate() {
        return hireDate;
    }

    @Override
    public int compareTo(Employee o) {
        return this.hireDate.compareTo(o.hireDate);
    }

    @Override
    public String toString(){
        return name + " " + hireDate;
    }

}
