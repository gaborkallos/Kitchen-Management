import Employes.KitchenStaffs.Chef;
import Employes.KitchenStaffs.Cooks;
import Employes.KitchenStaffs.Helpers;

public class Main {

    public static void main(String[] args) {
        WorkingInKitchen working = new WorkingInKitchen();
        working.employEmployees(new Chef("Mr Chef", "February 1, 1960", 40_000));
        working.employEmployees(new Cooks("Banana Joe", "August 5, 1974", 28_000));
        working.employEmployees(new Helpers("Slave Steve", "January 1, 1999", 15_000));
        working.employEmployees(new Helpers("Slave Hank", "March 8, 2001", 15_000));

    }
}
