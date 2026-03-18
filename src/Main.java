public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Abecadlo","Jan kowal",60,true);
        Ksiazka ksiazka2 = new Ksiazka("Koty","Jan Nowak",100,false);
        Ksiazka ksiazka3 = new Ksiazka("Psy","Pawel kowal",20,false);

        ksiazka1.wypozycz();
        ksiazka2.wypozycz();
        ksiazka3.zwroc();



    }
}