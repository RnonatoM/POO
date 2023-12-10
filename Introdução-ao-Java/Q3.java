import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ângulo em graus: ");
        double anguloEmGraus = scanner.nextDouble();
        double anguloEmRadianos = anguloEmGraus * Math.PI / 180.0;
        System.out.println("Ângulo em radianos: " + anguloEmRadianos);
        System.out.println("Seno: " + Math.sin(anguloEmRadianos));
        System.out.println("Cosseno: " + Math.cos(anguloEmRadianos));
        System.out.println("Tangente: " + Math.tan(anguloEmRadianos));
        System.out.println("Cossecante: " + 1 / Math.sin(anguloEmRadianos));
        System.out.println("Secante: " + 1 / Math.cos(anguloEmRadianos));
        System.out.println("Cotangente: " + 1 / Math.tan(anguloEmRadianos));
        scanner.close();
    }
}
