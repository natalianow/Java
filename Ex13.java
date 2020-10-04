package NewRepo;

public class Ex13 {
    public static void main(String[] args) {
        int a  = Integer.MAX_VALUE;                                // float a = 7.9f;
        short b = (short)a; // rzutowanie jawne                    // int b = (int)a;
        String liczba = Integer.toString(b);
        int c = Integer.parseInt(liczba);


        System.out.println(c + 1);
    }
}
