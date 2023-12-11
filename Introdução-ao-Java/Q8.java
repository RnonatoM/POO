import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do setor (111 ou 222):   ");
        int codigoSetor = scanner.nextInt();
        System.out.print("Digite o valor original do produto:   ");
        double valorOriginal = scanner.nextDouble();
        if (codigoSetor == 111) {
            double desconto = 0.0;
            if (valorOriginal > 100) {
                desconto = 0.4;
            } else if (valorOriginal >= 50) {
                desconto = 0.2;
            } else {
                desconto = 0.1;
            }

            double valorComDesconto = valorOriginal  -  (desconto * valorOriginal);
            System.out.println("Setor: Cama, mesa e banho");
            System.out.println("Valor com desconto:  R$ "  +  valorComDesconto);
        } else if (codigoSetor == 222) {
            double desconto = 0.1;
            if (valorOriginal > 500) {
                desconto = 0.1;
            }

            double valorComDesconto = valorOriginal  - (desconto * valorOriginal);
            System.out.println("Setor: Eletros");
            System.out.println("Valorcom desconto:  R$ "  +  valorComDesconto);
        } else {
            System.out.println("Setor invalido");
            scanner.close();
        }
    }
}
