import Employes.KitchenStaffs.Chef;
import Employes.KitchenStaffs.Cooks;
import Employes.KitchenStaffs.Helpers;

public class Main {

    public static void main(String[] args) {
        WorkingInKitchen working = new WorkingInKitchen();
        working.employEmployees(new Chef("Gordon", "February 1, 1960", 42_000));
        working.employEmployees(new Chef("Jamie", "February 1, 1960", 40_000));
        working.employEmployees(new Chef("Lee", "February 1, 1960", 41_000));

        working.employEmployees(new Cooks("Banana Joe", "August 5, 1974", 28_000));

        working.employEmployees(new Helpers("Slave Steve", "January 1, 1999", 15_500));
        working.employEmployees(new Helpers("Slave Hank", "March 8, 2001", 14_900));
        working.employEmployees(new Helpers("Slave John", "September 20, 1988", 15_500));
        working.employEmployees(new Helpers("Slave Marta", "September 20, 1988", 15_300));


        working.working(100);
    }
}
