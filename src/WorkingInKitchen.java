import Employes.Employees;
import Employes.KitchenStaffs.Chef;
import Employes.KitchenStaffs.Helpers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Util.MyRandom.*;

public class WorkingInKitchen {

    private List<Employees> staffs = new ArrayList<Employees>();
    private boolean ChefIsCooking;


    public void setChefIsCooking(boolean chefCooking) {
        ChefIsCooking = chefCooking;
    }

    public boolean isChefIsCooking() {
        return ChefIsCooking;
    }

    public void employEmployees(Employees employees) {
        staffs.add(employees);

    }

    public void getHelperHand() {
        for (Employees staff : staffs) {
            if (staff instanceof Helpers) {
                System.out.println(((Helpers) staff).getHelperHand());
            }

        }
    }

    public void working() {
        for (int i = 0; i < 100; i++) {
            ChefCooking();
            if (isChefIsCooking()){
                takeIngredients();

            }

        }
    }

    private void takeIngredients() {
        String requiredIngredient = randomIngredients();
        boolean canGiveIngredient = false;
        for (Employees staff : staffs) {
            if (staff instanceof Helpers){
                Map<String, Integer> helperHand = ((Helpers) staff).getHelperHand();
                if (helperHand.get(requiredIngredient)>0){
                    helperHand.put(requiredIngredient, helperHand.get(requiredIngredient) - 1);
                    canGiveIngredient = true;
                }
            }

        }
        if (!canGiveIngredient){
            //Todo HELPERS YELL WE ARE OUT!
        }
    }

    private void ChefCooking() {
        for (Employees staff : staffs) {
            if(staff instanceof Chef){
                ((Chef) staff).setCooking(randomBoolean());
                if(((Chef)staffs).isCooking()){
                    setChefIsCooking(true);
                }
            }
        }
    }
}
