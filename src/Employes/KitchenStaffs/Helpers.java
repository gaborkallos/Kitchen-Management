package Employes.KitchenStaffs;

import Employes.Employees;

import java.util.HashMap;
import java.util.Map;

import static Util.MyRandom.randomNumberBetween;

public class Helpers extends Employees {

    private Map<String, Integer> helperHand = new HashMap<>();
    private String[] ingredients = new String[] {"carrot", "potato", "meat"};

        public Helpers(String name, String dob, double salary) {
            super.setName(name);
            super.setDob(dob);
            super.setSalary(salary);
            super.setTax(salary * 0.01);
            for (String ingredient: ingredients) {
                addIngredients(ingredient);
            }
        }

        public void addIngredients(String ingredient ) {
            helperHand.put(ingredient, randomNumberBetween(0,3));
        }

    public Map<String, Integer> getHelperHand() {
        return helperHand;
    }
}
