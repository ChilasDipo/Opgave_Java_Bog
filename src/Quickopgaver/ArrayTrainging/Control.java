package Quickopgaver.ArrayTrainging;

public class Control {

    public static void main(String[] args) {
        Control control = new Control();
        control.doit();
    }


    public void doit(){

        AtomBomb[]  bombsarray = new AtomBomb[1000000];


        for (int i = 0; i < bombsarray.length ; i++) {
            bombsarray[i] = new AtomBomb();
            System.out.println(bombsarray[i].toString());
            bombsarray[i].detonate();
        }
    }

}
