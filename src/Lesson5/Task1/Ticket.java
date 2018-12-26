package Lesson5.Task1;

public class Ticket {
    private final int numberOfTicket;
    private final PassengerInfo passengerInfo;
    private final FlightInfo flightInfo;

    public Ticket(int numberOfTicket, PassengerInfo passengerInfo, FlightInfo flightInfo) {
        this.numberOfTicket = numberOfTicket;
        this.passengerInfo = passengerInfo;
        this.flightInfo = flightInfo;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public PassengerInfo getPassengerInfo() {
        return passengerInfo;
    }

    public FlightInfo getFlightInfo() {
        return flightInfo;
    }

    float finalPriceTicket() {
        return getFlightInfo().getPrice();
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "NumberOfTicket = " + numberOfTicket + "\n " +
                "PassengerInfo = " + passengerInfo + "\n " +
                "FlightInfo = " + flightInfo +
                '}';
    }
}
