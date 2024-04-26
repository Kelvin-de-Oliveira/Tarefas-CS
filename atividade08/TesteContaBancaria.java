import java.util.Scanner;

// Classe de teste (executável)
public class TesteContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria(1000);

        System.out.println("Saldo atual: " + conta.getSaldo());

        try {
            System.out.print("Informe o valor para sacar: ");
            double valorSaque = scanner.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("Saque de " + valorSaque + " realizado com sucesso.");
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Saldo atual: " + conta.getSaldo());

        scanner.close();
    }
}