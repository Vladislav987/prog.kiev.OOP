package Lesson5.Task1;

public class Meal {
    private final Meals meals;
    private final Drink drink;
    private final float price;


    public Meal( Meals meals, Drink drink, float price) {
        this.meals = meals;
        this.drink = drink;
        this.price = price;
    }

    public Meals getMeals() {
        return meals;
    }

    public Drink getDrink() {
        return drink;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "typeFood = '" + meals + '\'' +
                ", drink = " + drink +
                ", price = " + price +
                '}';
    }

    enum Meals {
        Rise, Potato, Vegetable, Chiken, Pork
    }

    public enum Drink {
        Yes,
        No
    }

}
