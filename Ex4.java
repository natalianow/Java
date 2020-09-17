package NewRepo;

public class Ex4 {
    public static void main(String[] args) {
        int a = 5, b = 6;
        boolean logiczna = a == b; //równość
        boolean logiczna2 = a != b; // różność
        // >, >=, <, <=
        // operator konkatenacji && (logiczna koniunkcja), || (logiczna alternatywa)
        // negacja !true/!false
        boolean logiczna3 = !(a == b);
        System.out.println(logiczna);
        System.out.println(logiczna2);
        System.out.println(logiczna3);
    }
}
