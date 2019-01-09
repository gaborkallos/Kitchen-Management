import Employes.Employees;
import Employes.KitchenStaffs.Chef;
import Employes.KitchenStaffs.Helpers;
import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

import java.util.*;

import static Util.MyRandom.*;

public class WorkingInKitchen {

    private List<Employees> staffs = new ArrayList<>();
    private boolean ChefIsCooking;


    private void setChefIsCooking(boolean chefCooking) {
        ChefIsCooking = chefCooking;
    }

    private boolean isChefIsCooking() {
        return ChefIsCooking;
    }

    public void employEmployees(Employees employees) {
        staffs.add(employees);

    }

    public void working(int turn) {
        int counter = 0;
        for (int i = 0; i < turn; i++) {
            setChefIsCooking(false);
            counter++;
            System.out.println("\n\u001B[31mRound: " + counter + "\u001B[0m");
            Collections.shuffle(staffs);
            ChefCooking();

        }
    }

    private void takeIngredients() {
        String requiredIngredient = randomIngredients();
        System.out.println("\u001B[33mChef wants " + requiredIngredient + "\u001B[0m");
        boolean canGiveIngredient = false;
        for (Employees staff : staffs) {
            if (staff instanceof Helpers) {
                Map<String, Integer> helperHand = ((Helpers) staff).getHelperHand();
                System.out.println("\u001B[34m" + staff.getName() + " has " +
                        ((Helpers) staff).getHelperHand().get(requiredIngredient) + "\u001B[0m");
                if (helperHand.get(requiredIngredient) > 0 && !canGiveIngredient) {
                    helperHand.put(requiredIngredient, helperHand.get(requiredIngredient) - 1);
                    canGiveIngredient = true;
                }
            }
        }
        if (!canGiveIngredient) {
            System.out.println("\u001B[31mWe are all out!\u001B[0m");
            for (Employees staff : staffs) {
                if (staff instanceof Helpers){
                    ((Helpers) staff).addIngredients(requiredIngredient);
                    System.out.println("\u001B[35m" + staff.getName() + " take from the fridge " +
                            ((Helpers) staff).getHelperHand().get(requiredIngredient) + " " +
                            requiredIngredient + "\u001B[0m");
                }

            }

        }
    }

    private void ChefCooking() {
        for (Employees staff : staffs) {
            if (staff instanceof Chef) {
                ((Chef) staff).setCooking(randomBoolean());
                if (((Chef) staff).isCooking()) {
                    setChefIsCooking(true);
                    System.out.println("\u001B[32m" + staff.getName() + " is cooking \u001B[0m");
                    if (isChefIsCooking()) {
                        takeIngredients();
                    }
                }
            }
        }
    }
}
