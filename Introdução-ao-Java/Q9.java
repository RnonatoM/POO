import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o valor da carta (1 a 13):   ");
        int valorCarta = scanner.nextInt();
        System.out.print("Digite o naipe da carta (1 a 4):   ");
        int naipeCarta = scanner.nextInt();

        String nomeCarta = "";
        switch (valorCarta) {
            case 1:
                nomeCarta = "ás";
                break;
            case 2:
                nomeCarta = "dois";
                break;
            case 3:
                nomeCarta = "três";
                break;
            case 4:
                nomeCarta = "quatro";
                break;
            case 5:
                nomeCarta = "cinco";
                break;
            case 6:
                nomeCarta = "seis";
                break;
            case 7:
                nomeCarta = "sete";
                break;
            case 8:
                nomeCarta = "oito";
                break;
            case 9:
                nomeCarta = "nove";
                break;
            case 10:
                nomeCarta = "dez";
                break;
            case 11:
                nomeCarta = "valete";
                break;
            case 12:
                nomeCarta = "dama";
                break;
            case 13:
                nomeCarta = "rei";
                break;
        }
        String nomeNaipe = "";
        switch (naipeCarta) {
            case 1:
                nomeNaipe = "ouros";
                break;
            case 2:
                nomeNaipe = "paus";
                break;
            case 3:
                nomeNaipe = "copas";
                break;
            case 4:
                nomeNaipe = "espadas";
                break;
        }
        System.out.println("O nome da carta é  "  + nomeCarta +  " de "  +  nomeNaipe);
        scanner.close();
    }
}
