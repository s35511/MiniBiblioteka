public class Main {

    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Abecadlo","Jan kowal",60,true);
        Ksiazka ksiazka2 = new Ksiazka("Koty","Jan Nowak",100,true);
        Ksiazka ksiazka3 = new Ksiazka("Psy","Pawel kowal",20,false);

        Czytelnik czytelnik1 = new Czytelnik("Jan","Kowalski",12345,0);
        Czytelnik czytelnik2 = new Czytelnik("Pawel","Jakis",23456,1);

        Biblioteka biblioteka1 = new Biblioteka(3);
        biblioteka1.dodajKsiazke(ksiazka1);
        biblioteka1.dodajKsiazke(ksiazka2);
        biblioteka1.dodajKsiazke(ksiazka3);
        biblioteka1.wypiszDostepneKsiazki();
        biblioteka1.wypozyczKsiazke("Abecadlo", czytelnik1);
        biblioteka1.wypiszDostepneKsiazki();
        biblioteka1.zwrocKsiazke("Abecadlo", czytelnik1);
    }

}