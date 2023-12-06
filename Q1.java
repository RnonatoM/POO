import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double ladoQuadrado;
        Scanner lQ = new Scanner(System.in);
        System.out.print("INFORMA QUAL O VALOR DO LADO DESEJADO:  ");
        ladoQuadrado = lQ.nextDouble();
        System.out.println(" AREA DO QUADRADO " + ladoQuadrado + " e " + Math.pow(ladoQuadrado, 2));
        lQ.close();
    }
}
