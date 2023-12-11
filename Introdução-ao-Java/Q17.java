public class Q17 {
    public static int potencia(int base, int expoente) {
        if (expoente == 1) {
            return base;
        }
        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        System.out.println(potencia(3, 4));
        System.out.println(potencia(2, 10));
    }
}
