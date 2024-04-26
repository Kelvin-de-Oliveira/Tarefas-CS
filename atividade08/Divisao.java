import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o divisor: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividir(numero1, numero2);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Insira apenas numeros reais.");
        }

        scanner.close();
    }

    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return dividendo / divisor;
    }
}