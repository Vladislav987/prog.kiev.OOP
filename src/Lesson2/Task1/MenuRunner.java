package Lesson2.Task1;

public class MenuRunner {
    public static void main(String[] args) {
        Menu salads = new Menu("Salads");
        salads.addDish(new Dish("Ceasar", " Green salad with chiken and sous 'Ceasar'", 120L));
        salads.addDish(new Dish("Duck ", "Salad with smoked duck", 105L));
        salads.addDish(new Dish("Vegetables", "Salad with yong radish and cucumber", 80L));
        System.out.println(salads.toString());
        System.out.println("Cheapest dish is " + salads.getCheapestDish());

        Menu burger = new Menu("Burger");
        burger.addDish(new Dish("Ringo burger", "Ringo cutlet burger with beef", 180L));
        burger.addDish(new Dish("Village burger", "Village burger with cutlet porc ond beef", 150L));
        burger.addDish(new Dish("Steak burger", "Steak burger with marbled beef", 240L));
        System.out.println(burger.toString());
        System.out.println("Cheapest dish is " + burger.getCheapestDish());
        System.out.println("***************************************************************");
        for (Dish elem: burger){
            System.out.println(elem);
        }
        System.out.println("***************************************************************");
        for(Dish elem: salads){
            System.out.println(salads);
        }
    }
}

//Menu  Salads
//  dish [Dish name - Ceasar
// descripshion -  Green salad with chiken and sous 'Ceasar'
// prise - 120
//, Dish name - Duck
// descripshion - Salad with smoked duck
// prise - 105
//, Dish name - Vegetables
// descripshion - Salad with yong radish and cucumber
// prise - 80
//]
//
//Cheapest dish is Dish name - Vegetables
// descripshion - Salad with yong radish and cucumber
// prise - 80
//
//Menu  Burger
//  dish [Dish name - Ringo burger
// descripshion - Ringo cutlet burger with beef
// prise - 180
//, Dish name - Village burger
// descripshion - Village burger with cutlet porc ond beef
// prise - 150
//, Dish name - Steak burger
// descripshion - Steak burger with marbled beef
// prise - 240
//]
//
//Cheapest dish is Dish name - Village burger
// descripshion - Village burger with cutlet porc ond beef
// prise - 150
//***************************************************************
//Dish name - Ringo burger
// descripshion - Ringo cutlet burger with beef
// prise - 180
//
//Dish name - Village burger
// descripshion - Village burger with cutlet porc ond beef
// prise - 150
//
//Dish name - Steak burger
// descripshion - Steak burger with marbled beef
// prise - 240
//
//***************************************************************
//Menu  Salads
//  dish [Dish name - Ceasar
// descripshion -  Green salad with chiken and sous 'Ceasar'
// prise - 120
//, Dish name - Duck
// descripshion - Salad with smoked duck
// prise - 105
//, Dish name - Vegetables
// descripshion - Salad with yong radish and cucumber
// prise - 80
//]
//
//Menu  Salads
//  dish [Dish name - Ceasar
// descripshion -  Green salad with chiken and sous 'Ceasar'
// prise - 120
//, Dish name - Duck
// descripshion - Salad with smoked duck
// prise - 105
//, Dish name - Vegetables
// descripshion - Salad with yong radish and cucumber
// prise - 80
//]
//
//Menu  Salads
//  dish [Dish name - Ceasar
// descripshion -  Green salad with chiken and sous 'Ceasar'
// prise - 120
//, Dish name - Duck
// descripshion - Salad with smoked duck
// prise - 105
//, Dish name - Vegetables
// descripshion - Salad with yong radish and cucumber
// prise - 80
//]


