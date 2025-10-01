import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n!
        int m = sc.nextInt(); // m!

        int resultado = 1;
        // multiplicamos desde m+1 hasta n
        for (int i = m + 1; i <= n; i++) {
            resultado *= i;
        }

        System.out.println(resultado);
    }
}

