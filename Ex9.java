package NewRepo;

public class Ex9 {
    public static void main(String[] args) {
        String[] tab = new String[20];                                // int[] tab = new int[5];   tab[0] = 2;   pokazuja sie zera
        tab[0] = "Ania";
        tab[1] = "Bartek";
        tab[2] = "Adam";

        for(int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);                               // pokazuja się null'e
        }

    }
}
