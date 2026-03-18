public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Abecadlo","Jan kowal",60,true);
        Ksiazka ksiazka2 = new Ksiazka("Koty","Jan Nowak",100,false);
        Ksiazka ksiazka3 = new Ksiazka("Psy","Pawel kowal",20,false);

        ksiazka1.wypiszinfo();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();
        ksiazka2.wypiszinfo();
        ksiazka2.wypozycz();
        ksiazka2.zwroc();
        ksiazka3.wypiszinfo();
        ksiazka3.wypozycz();
        ksiazka3.zwroc();
        Czytelnik czytelnik1 = new Czytelnik("Jan","Kowalski",12345,4);
        Czytelnik czytelnik2 = new Czytelnik("Pawel","Jakis",23456,6);
        czytelnik1.wypiszDane();
        czytelnik1.zwiekszLiczbeWypozyczen(2);
        czytelnik1.zmniejszLiczbeWypozyczen(2);
        czytelnik2.wypiszDane();
        czytelnik2.zwiekszLiczbeWypozyczen(2);
        czytelnik2.zmniejszLiczbeWypozyczen(2);



    }
}