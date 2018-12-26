package Lesson5.Task1;

import java.time.LocalDate;

public class TicketRunner {
    public static void main(String[] args) {
        PassengerInfo passengerInfo = new PassengerInfo("Vlad", "Ponomar", 1541);
        PassengerInfo passengerInfo1 = new PassengerInfo("Egor", "Dobrovolski", 3333);
        FlightInfo flightInfo = new FlightInfo(154, "Kiev", "London", LocalDate.now(), 24, 1548.2f);
        FlightInfo flightInfo1 = new FlightInfo(777, "Kiev", "Istanbul", LocalDate.now(), 1, 3500);
        Baggage baggage1 = new Baggage(350, 3);
        Meal meal1 = new Meal(Meal.Meals.Chiken, Meal.Drink.Yes, 270);


        Ticket a = new Ticket(2561, passengerInfo, flightInfo);
        VipTicket b = new VipTicket(3535, passengerInfo1, flightInfo1, baggage1, meal1);


        System.out.println("_________________________________________________________");
        System.out.println(b.toString());
        System.out.println("Total price of flight - " + b.finalPriceTicket());
        System.out.println("_________________________________________________________");
        System.out.println(a.toString());
        System.out.println("Total price of flight - " + a.finalPriceTicket());
        System.out.println("_________________________________________________________");
    }
}

//_________________________________________________________
//VipTicket{Ticket{NumberOfTicket = 3535
// PassengerInfo = PassengerInfo{namePassenger='Egor', surnamePassenger='Dobrovolski', passportI_D=3333}
// FlightInfo = FlightInfo{flightI_D=777, cityDepartue='Kiev', cityArrive='Istanbul', timeFlight=2018-07-07, placeNumber=1, price=3500.0}}
//Baggage = Baggage{priceBaggage=350.0, countBaggage=3}
//Meal = Meal{typeFood = 'Chiken', drink = Yes, price = 270.0}}
//Total price of flight - 4820.0
//_________________________________________________________
//Ticket{NumberOfTicket = 2561
// PassengerInfo = PassengerInfo{namePassenger='Vlad', surnamePassenger='Ponomar', passportI_D=1541}
// FlightInfo = FlightInfo{flightI_D=154, cityDepartue='Kiev', cityArrive='London', timeFlight=2018-07-07, placeNumber=24, price=1548.2}}
//Total price of flight - 1548.2
//_________________________________________________________
//
//Process finished with exit code 0
