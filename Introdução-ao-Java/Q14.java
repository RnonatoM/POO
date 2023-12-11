public class Q14 {
    public static void main(String[] args) {
        int[] numerosPerfeitos = new int[4];
        int indice = 0;
        for (int i = 1; i <= 100; i++) {
            int somaDivisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    somaDivisores += j;
                }
            }
            if (i == somaDivisores) {
                numerosPerfeitos[indice] = i;
                indice++;
            }
        }
        for (int numeroPerfeito : numerosPerfeitos) {
            System.out.println(numeroPerfeito);
        }
    }
}
