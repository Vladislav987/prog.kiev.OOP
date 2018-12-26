package Lesson4.Task1;

import java.util.ArrayList;
import java.util.List;

public class RidesHistory {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public long getTotalPrice() {
        long sumMoney = 0;
        for (Ride elem : rides) {
            sumMoney += elem.getPrice();
        }
        return sumMoney;
    }

    @Override
    public String toString() {
        return "RidesHistory{" +
                "rides=" + rides +
                '}';
    }
}
