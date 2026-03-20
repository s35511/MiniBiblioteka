public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numerKarty=numerKarty;
        this.liczbaWypozyczen=liczbaWypozyczen;
    }
    public void wypiszDane(){
        System.out.println("Imie: "+imie+" Nazwisko: "+nazwisko+" Numer karty: "+numerKarty+" Liczba Wypozyczen: "+liczbaWypozyczen);
    }
    public int zwiekszLiczbeWypozyczen(int liczba){
        System.out.println("Zwiekszenie wypozyczonych ksiazek z "+liczbaWypozyczen+" do "+(liczbaWypozyczen+liczba));
        return liczbaWypozyczen+=liczba;
    }
    public int zmniejszLiczbeWypozyczen(int liczba){
        System.out.println("Zmniejszenie liczby wypozyczonych ksiazek z "+liczbaWypozyczen+" do "+(liczbaWypozyczen-liczba));
        return liczbaWypozyczen-=liczba;
    }
}
