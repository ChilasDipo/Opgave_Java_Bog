package BilOpgave;

public class Car {
    static boolean caronoroff = false;
    static  int currentspeed = 0;
     static String password;
     static boolean handbrake;
     Car(){
         this.password = "password1234";
         this.currentspeed = 0;
         this.caronoroff = false;
         this.handbrake = true;
     }
    public static double setspeed(double timeintsec , double acceration) {
        return timeintsec * acceration ;
    }
    public static void setCurrentspeed(int currentspeed) {
         if(currentspeed == 200 ){
             System.out.println("Engine Burned too fast");
             System.exit(0);
         }else Car.currentspeed = currentspeed;
        System.out.println(currentspeed + " m/s");
    }
    String carkey = "password1234"  ;
    public static void turncaron(CarKey key){
        if (key.password.equals(password)) {
            System.out.println("key is correct");
            caronoroff = true;
            System.out.println("Car is now on");
        } else System.out.println("key is incorrect");
    }
    public static void turncaroff(CarKey key){
            caronoroff = false;
        System.out.println("Car is now off");
    }
    public static void setHandbrake(boolean handbrakestate) {
       if (handbrakestate == true )  {
           Car.handbrake = handbrakestate;
           Car.currentspeed = 0;
           System.out.println("handbrake is pulled and car is stopped");
       } else {
           Car.handbrake = handbrakestate;
        System.out.println("handbrake is no pulled");
       }

    }

}
