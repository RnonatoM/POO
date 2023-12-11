import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número:  ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número:  ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número:  ");
        int n3 = scanner.nextInt();
        int menor = n1;
        if (n2 < menor) {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        System.out.println("O menor númuro é:  "  + menor );
        scanner.close();
    }
}
