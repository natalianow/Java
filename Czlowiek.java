package NewRepo;

public class Czlowiek {
    Czlowiek(){
        liczebnosc++;
    }
    Czlowiek(String imie){
        this.imie = imie;
        liczebnosc++;
    }
    public String imie;
    static int liczebnosc = 0;
}
