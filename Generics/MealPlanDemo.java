// Personalized Meal Plan Generator
import java.util.*;

interface MealPlan {
    String getType();
}
class VegetarianMeal implements MealPlan {
    public String getType() { return "Vegetarian"; }
}
class VeganMeal implements MealPlan {
    public String getType() { return "Vegan"; }
}
class KetoMeal implements MealPlan {
    public String getType() { return "Keto"; }
}
class HighProteinMeal implements MealPlan {
    public String getType() { return "High-Protein"; }
}

class Meal<T extends MealPlan> {
    private T mealType;
    public Meal(T mealType) { this.mealType = mealType; }
    public T getMealType() { return mealType; }
}

class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        // Simple validation: only allow known types
        if (mealType instanceof VegetarianMeal || mealType instanceof VeganMeal || mealType instanceof KetoMeal || mealType instanceof HighProteinMeal) {
            return new Meal<>(mealType);
        } else {
            throw new IllegalArgumentException("Invalid meal type");
        }
    }
}

public class MealPlanDemo {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = MealPlanGenerator.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = MealPlanGenerator.generateMealPlan(new VeganMeal());
        System.out.println("Generated Meal Plan: " + vegMeal.getMealType().getType());
        System.out.println("Generated Meal Plan: " + veganMeal.getMealType().getType());
    }
}

