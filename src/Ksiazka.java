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


    public void wypiszinfo(){
        System.out.println("Tytuł: "+tytul+" Autor: "+autor+" Liczba stron: "+liczbaStron+" Dostepna: "+dostepna);
    }
    public boolean wypozycz(){
        if(dostepna){
            dostepna=false;
            System.out.println("Mozna wypozyczyc ksiazke milego czytania.");
            return true;
        }
        else {
            System.out.println("Ksiazka jest juz wypozyczona.");
            return false;
        }
    }
    public boolean zwroc(){
        dostepna=true;
        System.out.println("Dziekujemy za zwrot ksiazki");
        return true;
    }

    public String getTytul() {
        return tytul;
    }

    public boolean isDostepna() {
        return dostepna;
    }
}
