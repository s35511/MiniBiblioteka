public class Biblioteka {
    private Ksiazka[] ksiazki;
    private int liczbaKsiazek;
    
    public Biblioteka(int pojemnosc){
        ksiazki = new Ksiazka[pojemnosc];
        liczbaKsiazek=0;
    }
    public void dodajKsiazke(Ksiazka ksiazka){
        if(liczbaKsiazek<ksiazki.length){
            ksiazki[liczbaKsiazek]=ksiazka;
            liczbaKsiazek++;
            System.out.println("dodano ksiazke pomyslnie");
        }
        else{
            System.out.println("Nie ma miejsca na dodanie ksiazki");
        }
    }
    public void wypiszDostepneKsiazki(){
        for(int i=0;i<ksiazki.length;i++){
            if(ksiazki[i].isDostepna()){
                ksiazki[i].wypiszinfo();
            }
        }
    }
    public Ksiazka znajdzKsiazkePoTytule(String tytul){
        for(int i=0;i<ksiazki.length;i++){
            if(ksiazki[i].getTytul().equals(tytul)){
                return ksiazki[i];
            }
        }
        return null;
    }
    public void policzDostepneKsiazki(){
        int liczbaDostepnychKsiazek=0;
        for(int i=0;i<ksiazki.length;i++){
            if(ksiazki[i].isDostepna()){
                liczbaDostepnychKsiazek++;
            }
        }
        System.out.println(liczbaDostepnychKsiazek);
    }
    
}
