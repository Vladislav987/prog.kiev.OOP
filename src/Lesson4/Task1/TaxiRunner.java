package Lesson4.Task1;

public class TaxiRunner {
    public static void main(String[] args) {
        Ride s = new Ride(4, 75, 30, new StandardTariff());
        Ride s1 = new Ride(1, 33, 13, new StandardTariff());
        Ride f = new Ride(5, 66, 45, new FamilyTariff());

        RidesHistory my = new RidesHistory();
        my.addRide(s);
        my.addRide(s1);
        my.addRide(f);
        my.addRide(new Ride(4,26,12, new FamilyTariff()));

        System.out.println("Sum of money for all rides is - " + my.getTotalPrice());
        System.out.println(my.toString());

    }
}

//Sum of money for all rides is - 1180
//RidesHistory{rides=[Ride{passengers=4, distance=75, duration=30, tariff=465}+
//, Ride{passengers=1, distance=33, duration=13, tariff=221}+
//, Ride{passengers=5, distance=66, duration=45, tariff=314}+
//, Ride{passengers=4, distance=26, duration=12, tariff=180}+
//]}
