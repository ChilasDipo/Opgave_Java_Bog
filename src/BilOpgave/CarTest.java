package BilOpgave;

public class CarTest {
    public static void main(String[] args) {
        testsuite();
        System.out.println();
        driving();
    }
        public static void testsuite() {
            Car car = new Car();
            CarKey key = new CarKey("Password1234");
            carstartwithcorrectkey(key);
            CarKey key1 = new CarKey("Password1234");
            carstartwithincorrectkey(key1);
            carspeed0();
            int speed = (int)car.setspeed(1,36);
            car.setCurrentspeed(speed);
            carspeed10();
            speed = (int)car.setspeed(8,3.5);
            car.setCurrentspeed(speed);
            accelerate3halvkm8sec();
            car.setHandbrake(true);
            handbrake();
            //testenum();
        }
        public static void driving() {
            Car car = new Car();
            CarKey key = new CarKey("password1234");
            car.turncaron(key);
            car.setHandbrake(false);
            car.setCurrentspeed((int)car.setspeed(8,3.5));
            car.setHandbrake(true);
            car.turncaroff(key);
        }
    public static void carstartwithcorrectkey(CarKey key) {
        if (key.equals("password1234")) {
            System.out.println("correctkey pass");
        } else System.out.println("correctkey fail");
    }
    public static void carstartwithincorrectkey(CarKey key) {
        if (!key.equals("password1234")) {
            System.out.println("incorrectkey pass");
        } else System.out.println("incorrectkey fail");
    }
    public static void carspeed0() {
        if (Car.currentspeed == 0) {
            System.out.println("speed0 pass");
        } else System.out.println("speed0 fail");
    }
    public static void carspeed10() {
        if (Car.currentspeed == 10) {
            System.out.println("speed10 pass");
        } else System.out.println("speed10 fail");
    }
    public static void accelerate3halvkm8sec() {
        if (Car.currentspeed ==  28 ) {
            System.out.println("accelerate3halvkm8sec pass");
        } else System.out.println("accelerate3halvkm8sec fail");
    }
    public static void handbrake() {
        if (Car.currentspeed == 0 && Car.handbrake == true) {
            System.out.println("handbrake pass");
        } else System.out.println("handbrake fail");
    }
   // public static void testenum(){
  //      System.out.println(caronoroff.OFF);
  //  }
}
