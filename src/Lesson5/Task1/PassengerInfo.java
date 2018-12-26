package Lesson5.Task1;

public class PassengerInfo {
    private final String namePassenger;
    private final String surnamePassenger;
    private final int passportI_D;

    public PassengerInfo(String namePassenger, String surnamePassenger, int passportI_D) {
        this.namePassenger = namePassenger;
        this.surnamePassenger = surnamePassenger;
        this.passportI_D = passportI_D;
    }

    public String getNamePassenger() {
        return namePassenger;
    }

    public String getSurnamePassenger() {
        return surnamePassenger;
    }

    public int getPassportI_D() {
        return passportI_D;
    }

    @Override
    public String toString() {
        return "PassengerInfo{" +
                "namePassenger='" + namePassenger + '\'' +
                ", surnamePassenger='" + surnamePassenger + '\'' +
                ", passportI_D=" + passportI_D +
                '}';
    }
}
