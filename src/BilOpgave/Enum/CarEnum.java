package BilOpgave.Enum;
public class CarEnum{

    Gears gears;
    Power power;
    Pedel pedel;

    public CarEnum(){
        power = Power.OFF;
        gears = Gears.free;
        pedel = Pedel.nopress;

    }
    public CarEnum(Gears gears) {
        this.gears = gears;
    }
    public CarEnum(Power power) {
        this.power = power;
    }
    public CarEnum(Pedel pedel) {
        this.pedel = pedel;
    }
    public void gearswich() {
        switch (gears) {
            case first:
                System.out.println("Gearet er det første");
                break;
            case two:
                System.out.println("Du er nu i andet gear");
                break;
            case third:
                System.out.println("Du er nu i third gerar ");
                break;
            case free:
                System.out.println("Du er nu i friigear");
                break;
            default:
                System.out.println("WEAK DAY");
        }
    }
    public void Power(){
        Power temp = Power.ON;
        if (power.equals(Power.ON)){
            System.out.println("Car is on");
        }else if (power.equals(Power.OFF)){
            System.out.println("Car is off");
        }
    }
    public void pedelpress() {
        switch (pedel) {
            case fullpress:
                System.out.println("din pedal kan ikke komme længere ned");
                break;
            case halfpress:
                System.out.println("din pedal er halvt trykket ned");
                break;
            case nopress:
                System.out.println("din pedal er ikke trykket ned ");
                break;
            default:
                System.out.println("something wrong with predel");
        }
    }

    public static void main(String[] args) {
        CarEnum gust = new CarEnum();
        gust.Power();
        gust.gearswich();
        gust.pedelpress();
        gust = new CarEnum(Power.ON);
        gust.Power();
        gust = new CarEnum(Gears.first);
        gust.gearswich();
        gust = new CarEnum(Pedel.fullpress);
        gust.pedelpress();


        
    }


}