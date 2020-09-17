package NewRepo;

public class Ex5 {
    public static void main(String[] args) {
        int wiek = 15;
        if(wiek >= 18) {
            System.out.println("Pełnoletnia");
        }
        else{
            if(wiek >= 16) {
                System.out.println("Możesz pracować");
            }
            else {
                System.out.println("Nie możesz pracować");

                /*
                else if (wiek >= 16)
                {
                System.out.println("Mozesz pracowac")
                }
                else{
                System.out.println("Nie mozesz pracowac")
                } Moze byc zaprezentowany ale nie jest to konieczne
                 */
            }
        }
        // operator trójargumentowy
        String imie = wiek >= 18 ? "Bartek" : "Bartuś";
        System.out.println(imie);
    }
}
