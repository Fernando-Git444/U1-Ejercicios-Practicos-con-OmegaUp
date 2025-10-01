import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        calcular(numero);
        entrada.close();
    }

    public static long calcular(int valor) {
        if (valor <= 5) {
            System.out.println(1);
            return 1;
        } else {
            long resultadoPrevio = calcular(valor - 2);
            long resultadoActual = resultadoPrevio * 5;
            System.out.println(resultadoActual);
            return resultadoActual;
        }
    }
}
