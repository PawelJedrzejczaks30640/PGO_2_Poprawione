import java.time.LocalDate;

public class Osoba {
    public static int cenaStartowa = 40;
    public int wiek;
    public String miasto;
    public String dzienTygodnia = sprawdzDzienTygodnia().toLowerCase();

    public Osoba(int age, String city) {
        this.wiek = age;
        this.miasto = city.toLowerCase();
    }

    public Osoba(int age, String city, String weekday) {
        this(age, city);
        this.dzienTygodnia = weekday.toLowerCase();
    }

    public static String sprawdzDzienTygodnia() {
        return LocalDate.now().getDayOfWeek().name();
    }

    public int oblcizanieZnizki() {
        int znizka = 0;
        if ((this.wiek < 10) || (this.dzienTygodnia.equals("wtorek"))) {
            znizka = 100;
            return znizka;
        }
        if (this.wiek <= 18)
            znizka += 50;
        if (this.miasto.equals("Warszawa"))
            znizka += 10;
        return znizka;
    }

    public double cenaPoZnizce() {
        return (1 - (oblcizanieZnizki() / 100.00)) * cenaStartowa;
    }

    public void printData() {
        System.out.println("Data: " + this.miasto + ", " + this.wiek + " years old, " + this.dzienTygodnia + " Ticket price: " + cenaPoZnizce() + " PLN");
        System.out.println("Discount: " + oblcizanieZnizki() + "%");
    }
}