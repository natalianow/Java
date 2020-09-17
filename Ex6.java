package NewRepo;

public class Ex6 {
    public static void main(String[] args) {
        int poraRoku = 1; // default wykonuje sie gdy nawiazujemy do case'a ktory nie isnieje
        // switch
        switch (poraRoku){
            case 1:
                System.out.println("Wiosna");
                break;
            case 2:
                System.out.println("Lato");
                break;
            case 3:
                System.out.println("Jesień");
                break;
            case 4:
                System.out.println("Zima");
                break;
            default:
                System.out.println("Zyjesz na innej planecie");
        }
    }
}
