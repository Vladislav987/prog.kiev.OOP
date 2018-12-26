package Lesson5.Task1;

////Смоделировать авибилеты 2 типов: стандартный авиабилет и vip-авиабилет, который расширяет функционал стандартного добавлением платных сервисов (багаж и еда). Нарисовать UML диаграмму и написать классы.
////Основные сущности:
////Авиабилет (Ticket).
////Свойства: номер авиабилета, информация о пассажире, информация о полете.
////Методы: подсчет стоимости (по информации о полете).
////Vip-авиабилет (VipTicket) - расширяет авиабилет (Ticket).
////Дополнительные свойства: сервис по багажу, сервис по еде.
////Методы: подсчет стоимости (учитывается базовая стоимость и стоимость дополнительных сервисов).
////Информация о пассажире (PassengerInfo).
////Свойства: имя, фамилия, номер паспорта.
////Информация о полете (FlightInfo).
////Свойства: номер полета, место отправки, место прибытия, время отправки, номер места, стоимость.
////Методы: подсчет стоимости.
////Сервис багажа (Baggage).
////Свойства: стоимость одной сумки, количество сумок.
////Методы: подсчет стоимости.
////Сервис еды (Meal).
////Свойства: тип еды, с напитком или без, стоимость.
////Методы: подсчет стоимости.
////Клиентский класс TicketRunner: протестировать функционал предыдущих классов.

public class Baggage {
    private final float priceBaggage;
    private final int countBaggage;

    public Baggage(float priceBaggage, int countBaggage) {
        this.priceBaggage = priceBaggage;
        this.countBaggage = countBaggage;
    }

    public float getPriceBaggage() {
        return priceBaggage;
    }

    public int getCountBaggage() {
        return countBaggage;
    }

    float BaggageValuePrice() {
        return priceBaggage * countBaggage;
    }

    @Override
    public String toString() {
        return "Baggage{" +
                "priceBaggage=" + priceBaggage +
                ", countBaggage=" + countBaggage +
                '}';
    }
}
