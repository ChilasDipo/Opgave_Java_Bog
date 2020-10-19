package BilOpgave;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        CarKey key = new CarKey("Password1234");
        carstartwithcorrectkey("password1234");
        carstartwithincorrectkey("password12345");
        carspeed0();
        int speed = (int)Car.setspeed(1,36);
        Car.setCurrentspeed(speed);
        carspeed10();
        speed = (int)Car.setspeed(60,40);
        Car.setCurrentspeed(speed);
        accelerate40km60sec();

    }

    public static void carstartwithcorrectkey(String key) {
        if (key.equals("password1234")) {
            System.out.println("correctkey pass");
        } else System.out.println("correctkey fail");
    }
    public static void carstartwithincorrectkey(String key) {
        if (!key.equals("password1234")) {
            System.out.println("incorrectkey pass");
        } else System.out.println("incorrectkey fail");
    }
    private static void testStartCarWithCorrectKey() {
        Car car1 = new Car();
        CarKey key = new CarKey("password1234");
        car1.turncaron(key);
    }

    private static void testStartCarWithWrongKey() {
        Car car1 = new Car();
        CarKey key = new CarKey("hest");
        car1.turncaron(key);
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
    public static void accelerate40km60sec() {
        if (Car.currentspeed ==  666 ) {
            System.out.println("accelerate40km60sec pass");
        } else System.out.println("accelerate40km60sec fail");
    }

}
