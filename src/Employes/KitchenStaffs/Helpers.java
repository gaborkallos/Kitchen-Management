package Employes.KitchenStaffs;

import Employes.Employees;
import Util.MyRandom;

import java.util.Date;
import java.util.Map;

import static Util.MyRandom.randomNumberBetween;

public class Helpers extends Employees {

    private Map<String, Integer> helperHand;
    private String[] ingredients = new String[] {"carrot", "potato", "meat"};

        public Helpers(String name, Date dob, double salary) {
            super.setName(name);
            super.setDob(dob);
            super.setSalary(salary);
            super.setTax(salary * 0.01);
            for (String ingredient: ingredients) {
                addIngredients(ingredient);
            }
        }

        void addIngredients(String ingredient ) {
            helperHand.put(ingredient, randomNumberBetween(0,3));
        }
    }
