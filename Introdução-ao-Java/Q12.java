import java.util.Random;

public class Q12 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numero = new int[6];
        for (int i = 0; i < numero.length; i++){
            numero[i] = random.nextInt(60) + 1;
        }

        System.out.println("Mega-Sena");
        System.out.println("--------------------");
        for (int i = 0; i < numero.length; i++){
            if (i == 0) {
                System.out.print("  |  ");
            }
            System.out.printf("%02d | ", numero[i]);
            if (i == 5) {
                System.out.println();
            }
        }
    }
}
