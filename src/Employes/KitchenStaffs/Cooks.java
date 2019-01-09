package Employes.KitchenStaffs;

import Employes.CanCook;


public class Cooks extends CanCook {

    public Cooks(String name, String dob, double salary) {
        super.setName(name);
        super.setDob(dob);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }
}
