package CompanyExample;

import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        disallowNullArgs(name,hireDate);
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
    public String toString(){
        return name + " " + hireDate;
    }

    public void disallowNullArgs(Object... args){
        for(Object arg:args)
            if(arg==null)
                throw new IllegalArgumentException("Null arguments");
    }
}
