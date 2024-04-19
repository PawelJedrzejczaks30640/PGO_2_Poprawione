import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testZnizkaDziecka() {
        Osoba osoba = new Osoba(5, "bydgoscz", "wtorek");
        assertEquals(100, osoba.oblcizanieZnizki());
    }

    @Test
    void testLiczenieZnizkiNastolatek() {
        Osoba osoba = new Osoba(16, "częstochowa", "sobota");
        assertEquals(50, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaNastolatekWarszawa() {
        Osoba osoba = new Osoba(12, "warszawa", "poniedziałek");
        assertEquals(60, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaCzwartkowa() {
        Osoba osoba = new Osoba(29, "piotrków", "czwartek");
        assertEquals(100, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaOsobaDorosla() {
        Osoba osoba = new Osoba(43, "kraków","poniedzialek");
        assertEquals(0, osoba.oblcizanieZnizki());
    }
    @Test
    void testZnizkaOsobaDorosłaWarszawa() {
        Osoba osoba = new Osoba(22, "warszawa","wtorek");
        assertEquals(0, osoba.oblcizanieZnizki());
    }

}
