package Kapitel_4;

public class TestSuiteForTask17 {
    public static void main(String[] args) {
        correctstringjan01( Task17.mounthandday(2001,"Jan"));
        correctstringjan16(Task17.mounthandday(2001,"jan"));
        correctstringfeb08(Task17.mounthandday(2008,"Feb"));
        correctstringfeb08(Task17.mounthandday(2008,"feb"));
    }


    public static void correctstringjan01(String mountandday) {
        if (mountandday.equals("Jan 2001 has 31 days")) {
            System.out.println("Pass Jan 2001");
        } else System.out.println("fail Jan 2001");
    }
    public static void correctstringfeb08(String mountandday) {
        if (mountandday.equals("Feb 2008 has 29 days")) {
            System.out.println("Pass Feb 2008");
        } else System.out.println("fail Feb 2008");
    }

    public static void correctstringjan16(String mountandday) {
        if (mountandday.equals("incorrect month name")) {
            System.out.println("Pass wrong name");
        } else System.out.println("fail wrong name");
    }
}
