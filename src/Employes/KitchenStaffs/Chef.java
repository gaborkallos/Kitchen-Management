package Employes.KitchenStaffs;

import Employes.CanCook;
import Employes.Employees;

import java.util.Date;

public class Chef extends CanCook {

    public Chef(String name, Date dob, double salary) {
        super.setName(name);
        super.setDob(dob);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }


}
