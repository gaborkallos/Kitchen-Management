package Employes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Employees {
    private String name;
    private LocalDate dob;
    private double salary;
    private double tax;

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(dob, formatter);
        this.dob = date;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }
}
