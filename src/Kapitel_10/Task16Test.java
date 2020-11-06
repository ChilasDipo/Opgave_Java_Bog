package Kapitel_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task16Test {

    @Test
    void numberofdigits() {
        Task16 opgave = new Task16();
        assertEquals(4,opgave.numberofdigits(4321));
        assertEquals(0,opgave.numberofdigits(0));
        assertEquals(1,opgave.numberofdigits(-1));
      assertEquals(1,opgave.numberofdigits(7));
    }

    @Test
    void divisiblityby2or3() {
        Task16 opgave = new Task16();
        assertEquals(true,opgave.divisiblityby2or3(2));
        assertEquals(true,opgave.divisiblityby2or3(3));
       assertEquals(true,opgave.divisiblityby2or3(0));
        assertEquals(false,opgave.divisiblityby2or3(5));
        assertEquals(true,opgave.divisiblityby2or3(4));

    }
}