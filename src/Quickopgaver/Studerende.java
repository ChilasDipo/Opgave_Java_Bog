package Quickopgaver;

public class Studerende {
        String navn;
        int alder;
        String by;
        String studieretning;
        String campus;

        Studerende() {
        studieretning = "Datamatiker";
        campus = "Næstved";
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public Studerende(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;


    }

    public Studerende(String navn, int alder) {
        this.navn = navn;
        this.alder = alder;
    }
}


