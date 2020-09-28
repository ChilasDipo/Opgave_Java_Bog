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

    public Studerende(String navn, int alder, String by) {
        this.navn = navn;
        this.alder = alder;
        this.by = by;

    }
}

