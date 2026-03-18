public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;
    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna){
        this.tytul=tytul;
        this.autor=autor;
        this.liczbaStron=liczbaStron;
        this.dostepna=dostepna;

    }


    void wypiszinfo(){
        System.out.println("Tytuł: "+tytul+" Autor: "+autor+" Liczba stron: "+liczbaStron+" Dostepna: "+dostepna);
    }
    boolean wypozycz(){
        if(dostepna){
            System.out.println("Mozna wypozyczyc ksiazke milego czytania.");
            return dostepna=false;
        }
        else {
            System.out.println("Ksiazka jest juz wypozyczona.");
            return dostepna=true;
        }
    }
    boolean zwroc(){
        System.out.println("Dziekujemy za zwrot ksiazki");
        return dostepna=true;
    }
}
