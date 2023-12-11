public class Q13 {
    public static void main(String[] args) {
        System.out.print("Digite o número de termos:  ");
        int n = Integer.parseInt(System.console().readLine());
        int f0 = 0;
        int f1 = 1;

        System.out.print("0 ");
        for (int i = 2; i <= n; i++) {
            int fi = f0 + f1;
            System.out.print(fi + " ");
            f0 = f1;
            f1 = fi;
        }
    }
}
