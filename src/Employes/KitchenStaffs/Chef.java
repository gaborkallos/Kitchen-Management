package Employes.KitchenStaffs;

import Employes.CanCook;


public class Chef extends CanCook {

    private boolean isCooking = false;

    public Chef(String name, String dob, double salary) {
        super.setName(name);
        super.setDob(dob);
        super.setSalary(salary);
        super.setTax(salary * 0.01);
        super.setHasKnife(true);
    }

    public void setCooking(boolean cooking) {
        isCooking = cooking;
    }

    public boolean isCooking() {
        return isCooking;
    }
}
