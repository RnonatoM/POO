import java.util.Scanner;

public class Q2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número:  ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite o terceiro número: ");
        double n3 = scanner.nextDouble();
        double soma = n1 + n2 + n3;
        double media = soma / 3;
        System.out.println("A soma dos números é:  "  +  soma);
        System.out.println("A média aritmética dos números é:   "  +  media);
        scanner.close();
    }
}
