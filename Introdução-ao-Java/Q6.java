import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um intervalo em minutos:   ");
        int intervaloEmMinutos = scanner.nextInt();
        int dias = intervaloEmMinutos / (60 * 24);
        int horas = (intervaloEmMinutos % (60 * 24)) / 60;
        int minutos = intervaloEmMinutos % 60;

        System.out.println(dias  +  "  dias,  "  +  horas  +  "  horas  e  "  +  minutos  +  "  minutos");
        scanner.close();
    }
}
