package BilOpgave.Enum;

public class CarEnum {
     enum caronoroff {ON,OFF} ;

        static  int currentspeed = 0;
        static String password;
        static boolean handbrake;
        CarEnum(){
            this.password = "password1234";
            this.currentspeed = 0;
            caronoroff ON = caronoroff.ON;
            caronoroff OFF = caronoroff.OFF;
            this.handbrake = true;
        }
        public static double setspeed(double timeintsec , double acceration) {
            return timeintsec * acceration ;
        }
        public static void setCurrentspeed(int currentspeed) {
            if(currentspeed == 200 ){
                System.out.println("Engine Burned too fast");
                System.exit(0);
            }else BilOpgave.Enum.CarEnum.currentspeed = currentspeed;
            System.out.println(currentspeed + " m/s");
        }
        String carkey = "password1234"  ;
        public static void turncaron(CarKeyEnum key){
            if (key.password.equals(password)) {
                System.out.println("key is correct");
                caronoroff ON = caronoroff.ON;
                System.out.println("Car is now on");
            } else System.out.println("key is incorrect");
        }
        public static void turncaroff(CarKeyEnum key){
            caronoroff OFF = caronoroff.OFF;
            System.out.println("Car is now off");
        }
        public static void setHandbrake(boolean handbrakestate) {
            if (caronoroff.equals(caronoroff.ON) )  {
                BilOpgave.Enum.CarEnum.handbrake = handbrakestate;
                BilOpgave.Enum.CarEnum.currentspeed = 0;
                System.out.println("handbrake is pulled and car is stopped");
            } else {
                BilOpgave.Enum.CarEnum.handbrake = handbrakestate;
                System.out.println("handbrake is no pulled");
            }

        }

    }


