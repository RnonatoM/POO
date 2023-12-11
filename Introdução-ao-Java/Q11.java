import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número do dia:  ");
        int dia = scanner.nextInt();
        int diaDaSemana = (dia - 1) % 7;
        String diaDaSemanaString = "";
        switch (diaDaSemana) {
            case 0:
                diaDaSemanaString = "domingo";
                break;
            case 1:
                diaDaSemanaString = "segunda-feira";
                break;
            case 2:
                diaDaSemanaString = "terça-feira";
                break;
            case 3:
                diaDaSemanaString = "quarta-feira";
                break;
            case 4:
                diaDaSemanaString = "quinta-feira";
                break;
            case 5:
                diaDaSemanaString = "sexta-feira";
                break;
            case 6:
                diaDaSemanaString = "sábado";
                break;
        }
        System.out.println(" O dia " +  dia  +  " será uma "  +  diaDaSemanaString);
        scanner.close();
    }
}
