import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        int[] vector = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite valores inteiros para preencher o vetor (0 para sair):");

        try {
            int index = 0;
            while (true) {
                int value = scanner.nextInt();

                if (value == 0) {
                    vector[index] = value;
                    index++;
                    break;
                }

                if (index == 10) {
                    throw new ArrayIndexOutOfBoundsException("Você atingiu o limite máximo de valores (10).");
                }

                vector[index] = value;
                index++;
            }

            System.out.println("Valores digitados:");

            for (int i = 0; i < index; i++) {
                System.out.println(vector[i]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Por favor, digite um valor inteiro válido.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}