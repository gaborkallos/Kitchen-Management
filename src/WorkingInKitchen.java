import Employes.Employees;
import Employes.KitchenStaffs.Chef;
import Employes.KitchenStaffs.Cooks;
import Employes.KitchenStaffs.Helpers;

import java.util.ArrayList;
import java.util.List;

public class WorkingInKitchen {

    private List<Employees> staffs = new ArrayList<Employees>();


    public void employEmployees(Employees employees){
        staffs.add(employees);

    }

    public void getHelperHand(){
        for (Employees staff : staffs) {
            if (staff instanceof Helpers){
                System.out.println(((Helpers) staff).getHelperHand());
            }

        }
    }
}
