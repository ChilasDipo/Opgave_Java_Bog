package BilOpgave;

public class Car {
    boolean caronoroff = false;
     static int currentspeed = 0;
     String password;

     Car(){
         this.password = "password1234";
         this.currentspeed = 0;
         this.caronoroff = false;
     }
    public double getCurrentspeed() {
        return currentspeed;
    }

    public static double setspeed(int timeintsec , int accerationkmh) {
        return timeintsec * (accerationkmh * 0.27777777777778);
    }

    public static void setCurrentspeed(int currentspeed) {
        Car.currentspeed = currentspeed;
    }

    //    car car = new car();
    String carkey = "password1234"  ;


    public  void turncaron(CarKey key){
        if (key.password.equals(password)) {
            System.out.println("key is correct");
            caronoroff = true;
        } else System.out.println("key is incorrect");


    }

}
