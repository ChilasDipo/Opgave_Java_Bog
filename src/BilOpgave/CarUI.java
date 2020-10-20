package BilOpgave;

public class CarUI {
    public static void main(String[] args) {

            Car car = new Car();
            CarKey key = new CarKey("password1234");
            car.turncaron(key);
            car.setHandbrake(false);
            car.setCurrentspeed((int)car.setspeed(8,3.5));
            car.setHandbrake(true);
            car.turncaroff(key);
    }

    }

