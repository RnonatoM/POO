public class Q15 {
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int indice = 0;

        for (int i = 100; i <= 999; i++) {
            int somaCubo = 0;
            int numero = i;
            while (numero > 0) {
                int algarismo = numero % 10;
                somaCubo += algarismo * algarismo * algarismo;
                numero /= 10;
            }

            if (i == somaCubo) {
                numeros[indice] = i;
                indice++;
            }
        }

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
