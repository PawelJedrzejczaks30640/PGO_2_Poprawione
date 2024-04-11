import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testZnizkaDziecka() {
        Osoba osoba = new Osoba(5, "Bydgoscz", "Wtorek");
        assertEquals(100, osoba.oblcizanieZnizki());
    }

    @Test
    void testLiczenieZnizkiNastolatek() {
        Osoba osoba = new Osoba(16, "Częstochowa", "Sobota");
        assertEquals(50, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaNastolatekWarszawa() {
        Osoba osoba = new Osoba(12, "Warszawa", "Poniedziałek");
        assertEquals(60, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaCzwartkowa() {
        Osoba osoba = new Osoba(29, "Piotrków", "Czwartek");
        assertEquals(100, osoba.oblcizanieZnizki());
    }

    @Test
    void testZnizkaOsobaDorosla() {
        Osoba osoba = new Osoba(43, "Kraków","Poniedzialek");
        assertEquals(0, osoba.oblcizanieZnizki());
    }
    @Test
    void testZnizkaOsobaDorosłaWarszawa() {
        Osoba osoba = new Osoba(22, "Watszawa","Wtorek");
        assertEquals(0, osoba.oblcizanieZnizki());
    }

}