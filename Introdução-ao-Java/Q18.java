import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        
        System.out.println("n = " + n);
        System.out.println("0! = " + fatorial(n, 0));
    }
    public static int fatorial(int n, int nivel) {
        if (n == 0) {
            return 1;
        }
        System.out.print("\t".repeat(nivel) + n + "! = ");
        int resultado = n * fatorial(n - 1, nivel + 1);
        System.out.println(resultado);
        return resultado;
    }
}

