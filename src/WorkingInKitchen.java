import Employes.Employees;
import Employes.KitchenStaffs.Chef;

import java.util.ArrayList;
import java.util.List;

public class WorkingInKitchen {

    private List<Employees> staffs = new ArrayList<Employees>();


    public void employEmployees(){
        staffs.add(new Chef("Mr Chef", "February 1, 1960", 40000));

    }
}
