import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 3 digitos no formato CDU:  ");
        int numeroCDU = scanner.nextInt();
        int centena = numeroCDU / 100;
        int dezena = (numeroCDU % 100) / 10;
        int unidade = numeroCDU % 10;

        int numeroUCD = unidade * 100 + dezena * 10  +  centena;   
        System.out.println("O número no formato UCD é:  "  +  numeroUCD);
        scanner.close();
    }
}
