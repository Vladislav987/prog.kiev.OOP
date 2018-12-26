package Lesson5.Task1;


public class MealTest {
    public static void main(String[] args) {
        Meal a = new Meal(Meal.Meals.Chiken, Meal.Drink.Yes, 25);
        Meal b = new Meal(Meal.Meals.Potato, Meal.Drink.No, 458.3f);

        System.out.println(a.toString());
        System.out.println(b.toString());

    }
}
