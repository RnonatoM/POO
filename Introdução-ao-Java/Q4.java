import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus Celsius:  ");
        double temperaturaEmCelsius = scanner.nextDouble();
        double temperaturaEmFahrenheit = (temperaturaEmCelsius * 9.0 / 5.0) + 32.0;
        System.out.println("A temperatura em graus Fahrenheit é:  "  +  temperaturaEmFahrenheit);
        scanner.close();
    }
}
