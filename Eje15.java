import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // número de elementos
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += sc.nextInt();
        }

        System.out.println(suma);
    }

}
