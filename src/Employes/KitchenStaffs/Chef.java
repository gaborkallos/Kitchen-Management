package Employes.KitchenStaffs;

import Employes.CanCook;


public class Chef extends CanCook {

    public Chef(String name, String dob, double salary) {

        super.setName(name);
        super.setDob(dob);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }


}
