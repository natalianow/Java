package NewRepo;

public class Ex14 {
    public static void main(String[] args) {
        System.out.println(Zwierze.liczebnosc);

        Zwierze kot = new Zwierze();
        System.out.println(Zwierze.liczebnosc);
        kot.glos = "Meeeow";
        kot.imie = "Milka";
        kot.przedstawSie();
        kot.dajGlos(3);

        Zwierze pies = new Zwierze();
        System.out.println(Zwierze.liczebnosc);
        pies.imie = "Reksio";
        pies.przedstawSie();
    }
}

