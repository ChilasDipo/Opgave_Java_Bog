package BilOpgave;

public  class ENUMTEST {
Day day;

    public ENUMTEST(Day day) {
        this.day = day;
    }

    public void bestday(){
        switch (day){
            case MOODAY:
                System.out.println("MOODAY");
                break;
            case TUEDAY:
                System.out.println("TUEDAY");
                break;
            case ENDDAY:
                System.out.println("ENDDAY");
                break;
            default:
                System.out.println("WEAK DAY");
        }
    }

    public static void main(String[] args) {
        ENUMTEST firstDay = new ENUMTEST(Day.MOODAY);
        firstDay.bestday();
        ENUMTEST secoundDay = new ENUMTEST(Day.TUEDAY);
        secoundDay.bestday();
        secoundDay = new ENUMTEST(Day.ENDDAY);
        secoundDay.bestday();
    }
}
