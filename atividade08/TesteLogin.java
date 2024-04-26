import java.util.Scanner;

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de usuário:");
        String usuario = scanner.nextLine();

        System.out.println("Digite a senha:");
        String senha = scanner.nextLine();

        Login login = new Login("usuario_correto", "senha_correta");

        testarLogin(login, usuario, senha);
        scanner.close();
    }

    private static void testarLogin(Login login, String usuario, String senha) {
        try {
            if (login.fazerLogin(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
            } else {
                System.out.println("Nome de usuário ou senha incorretos.");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}