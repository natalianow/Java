package NewRepo;

public class Ex15 {

    public static void main(String[] args) {
    Czlowiek Jan = new Czlowiek("Jan");
    //Jan.imie = "Jan";
        System.out.println(Jan.imie);
    System.out.println(Czlowiek.liczebnosc);

    Czlowiek daniel = new Czlowiek();
    daniel.imie = "Daniel";
    System.out.println(Czlowiek.liczebnosc);

    }
}
