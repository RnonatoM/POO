import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a coordenada x do primeiro ponto: ");
        int x1 = scanner.nextInt();
        System.out.print("Digite a coordenada y do primeiro ponto: ");
        int y1 = scanner.nextInt();
        System.out.print("Digite a coordenada x do segundo ponto: ");
        int x2 = scanner.nextInt();
        System.out.print("Digite a coordenada y do segundo ponto: ");
        int y2 = scanner.nextInt();

        boolean acima = y2 > y1;
        boolean abaixo = y2 < y1;
        boolean esquerda = x2 < x1;
        boolean direita = x2 > x1;

        System.out.println("O segundo ponto está:");
        if (acima) {
            System.out.println("acima do primeiro");
        }
        if (abaixo) {
            System.out.println("abaixo do primeiro");
        }
        if (esquerda) {
            System.out.println("à esquerda do primeiro");
        }
        if (direita) {
            System.out.println("à direita do primeiro");
            scanner.close();
        }
    }
}
