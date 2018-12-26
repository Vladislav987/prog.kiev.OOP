package Lesson2.Task1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu implements Iterable<Dish> {
    private final String name;
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public Dish getCheapestDish() {
        Dish cheapestDish = dishes.get(0);
        for (Dish elem : dishes) {
            if (elem.getPrice() < cheapestDish.getPrice()) {
                cheapestDish = elem;
            }
        }
        return cheapestDish;
    }


    public String getName() {
        return name;
    }

    @Override
    public Iterator<Dish> iterator() {
        return dishes.iterator();
    }

    public String toString() {
        return "Menu  " + name + '\n' + "  dish " + dishes + '\n';
    }

}

//
