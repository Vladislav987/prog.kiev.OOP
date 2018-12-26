package Lesson5.Task1;

import java.time.LocalDate;

public class FlightInfo {
    private final int flightI_D;
    private final String cityDepartue;
    private final String cityArrive;
    private final LocalDate timeFlight;
    private final int placeNumber;
    private final float price;


    public FlightInfo(int flightI_D, String cityDepartue, String cityArrive, LocalDate timeFlight, int placeNumber, float price) {
        this.flightI_D = flightI_D;
        this.cityDepartue = cityDepartue;
        this.cityArrive = cityArrive;
        this.timeFlight = timeFlight;
        this.placeNumber = placeNumber;
        this.price = price;
    }

    public int getFlightI_D() {
        return flightI_D;
    }

    public String getCityDepartue() {
        return cityDepartue;
    }

    public String getCityArrive() {
        return cityArrive;
    }

    public LocalDate getTimeFlight() {
        return timeFlight;
    }

    public int getPlaceNumber() {
        return placeNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flightI_D=" + flightI_D +
                ", cityDepartue='" + cityDepartue + '\'' +
                ", cityArrive='" + cityArrive + '\'' +
                ", timeFlight=" + timeFlight +
                ", placeNumber=" + placeNumber +
                ", price=" + price +
                '}';
    }
}
