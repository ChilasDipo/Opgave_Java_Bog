package Quickopgaver.ObjektLoan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void getMonthlyPayment() {
        Loan opgave = new Loan();
        assertEquals(84.4661111639436,opgave.getMonthlyPayment());
    }

    @Test
    void getTotalPayment() {
        Loan opgave = new Loan();
        assertEquals(1013.5933339673231,opgave.getTotalPayment());
    }
}