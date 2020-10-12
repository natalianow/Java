package NewRepo;

public class Ex16 {
    public static void main(String[] args) {
        int liczba = 50;
        System.out.println("Liczba przed " + liczba);
        zmien(liczba);
        System.out.println("Liczba po " + liczba);

        Liczba oliczba = new Liczba();
        oliczba.liczba = 50;                    // Liczba oliczba2 = oliczba; oliczba2.liczba = 111;   (utworzenie nowego obiektu który ma przepisana kopie referencji)
        System.out.println("Obiekt Liczba przed " + oliczba.liczba);
        zmien(oliczba);
        System.out.println("Obiekt Liczba po " + oliczba.liczba);
    }

    public static void zmien(int liczba) {
        liczba = -1;
    }

    public static void zmien(Liczba oliczba) {
        oliczba.liczba = -1;
    }
}
