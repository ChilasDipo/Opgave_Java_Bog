package Kapitel_4;

public class Task17 {
    public static String mounthandday(int year, String month) {

        if(month.matches("Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec")){
            switch (month){
                case "Jan":
                    return "Jan " + year + " has 31 days";
                case "Feb":
                    if (year%4==0){
                        if (year%100==0){
                            if (year%400==0){ return "Feb " + year + " has 29 days";}
                            return "Feb " + year + " has 28 days";}
                        return "Feb " + year + " has 29 days";
                    }else return "Feb " + year + " has 28 days";
                case "Mar":
                    return "Mar " + year + " has 31 days";
                case "Apr":
                    return "Apr " + year + " has 30 days";
                case "May":
                    return "May " + year + " has 31 days";
                case "Jun":
                    return "Jun " + year + " has 30 days";
                case "Jul":
                    return "Jul " + year + " has 31 days";
                case "Aug":
                    return "Aug " + year + " has 31 days";
                case "Sep":
                    return "Sep " + year + " has 30 days";
                case "Oct":
                    return "Oct " + year + " has 31 days";
                case "Nov":
                    return "Nov " + year + " has 30 days";
                case "Dec":
                    return "Dec " + year + " has 31 days";
            }


        }return "incorrect month name";
    }
}
