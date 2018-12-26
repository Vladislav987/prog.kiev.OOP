package Lesson5.Task1;

public class VipTicket extends Ticket {
    private final Baggage baggage;
    private final Meal meal;

    public VipTicket(int numberOfTicket, PassengerInfo passengerInfo, FlightInfo flightInfo, Baggage baggage, Meal meal) {
        super(numberOfTicket, passengerInfo, flightInfo);
        this.baggage = baggage;
        this.meal = meal;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    float finalPriceTicket(){
        return baggage.BaggageValuePrice() + meal.getPrice() + getFlightInfo().getPrice();
    }

    public Meal getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "VipTicket{" + super.toString()+ "\n" +
                "Baggage = " + baggage + "\n" +
                "Meal = " + meal +
                '}';
    }
}
