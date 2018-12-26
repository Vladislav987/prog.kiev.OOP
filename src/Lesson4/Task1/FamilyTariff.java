package Lesson4.Task1;

//Написать ядро приложения для учета поездок в такси с различными тарифами.
//Поездка в такси (Ride) включает количество пассажиров (passengers), расстояние в километрах (distance), длительность в минутах (duration) и выбранный тариф (tariff).
//Есть несколько типов тарифов:
//1. Стандартный (StandardTariff): 30 + 5 * distance + 2 * duration.
//2. Семейный (FamilyTariff): 50 + 20 * distance / passengers.
//Система должна быть гибкой для добавления новых типов тарифов.
//Реализовать RidesHistory, содержащий множество поездок и умеющий подсчитывать суммарную стоимость всех поездок в соответствии с заданными тарифами.
//Написать TaxiRunner для тестирования функционала предыдущих классов.

public class FamilyTariff implements Tariff {
    @Override
    public long calculatePrice(Ride ride) {
        return 50 + 20 * ride.getDistance() / ride.getPassengers();
    }
}
