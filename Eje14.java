import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursiva(n);
    }

    public static int recursiva(int n) {
        if (n == 1) {
            System.out.println(1);
            return 1;
        }

        int resultado = 5 * recursiva(n / 2);
        System.out.println(resultado);
        return resultado;
    }

}
