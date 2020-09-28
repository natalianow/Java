package NewRepo;

public class Ex11 {
    public static void main(String[] args) {
        String h = wyswietl();
        System.out.println(h);              // System.out.println(wyswietl());            lub do linijki 10 System.out.println(dodaj());
    }                                                                                       //System.out.println(dodaj(x:5));
    static String wyswietl(){               // static int dodaj(){return 0;}                //System.out.println(dodaj(x:5, + y:6)); w konsoli powinny wyswietlic sie kolejno wartości 0, 6, 11
        return "Hello world!";              // static double dodaj(){return 1;} takie przeciazenie nie moze miec miejsca
    }                                       // static int dodaj(int x){return ++x;}
}                                           // static int dodaj(int x, int y){return x + y;}
