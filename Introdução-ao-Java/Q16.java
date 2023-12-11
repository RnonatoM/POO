public class Q16 {
    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double taxaCrescimentoA = 0.035;
        double taxaCrescimentoB = 0.01;
        int anos = 0;
        while (populacaoA < populacaoB) {
            populacaoA = (int) (populacaoA * (1 + taxaCrescimentoA));
            populacaoB = (int) (populacaoB * (1 + taxaCrescimentoB));
            anos++;
        }
        System.out.println("A população da cidade A será maior ou igual à população da cidade B em " + anos + " anos.");
    }
}
