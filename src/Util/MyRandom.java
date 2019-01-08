package Util;
import java.util.HashMap;
import java.util.Random;


public class MyRandom {
    private static final Random random = new Random();

    public static int randomNumberBetween (int min, int max){
        return random.nextInt((max-min)+1)+min;
    }

    public static boolean randomBoolean(){
        return random.nextBoolean();
    }

    public static String randomIngredients(){
        int number = randomNumberBetween(1,3);
        HashMap<Integer, String> ingredients = new HashMap<>();
        ingredients.put(1, "carrot");
        ingredients.put(2, "potato");
        ingredients.put(3, "meat");
        return ingredients.get(number);
    }
}
