class TesteLogin {
    public static void main(String[] args) {
        Login login = new Login("usuario_correto", "senha_correta");

        testarLogin(login, "usuario_correto", "senha_errada");
        testarLogin(login, "usuario_errado", "senha_correta");
        testarLogin(login, "usuario_correto", "senha_correta");
    }

    private static void testarLogin(Login login, String usuario, String senha) {
        try {
            if (login.fazerLogin(usuario, senha)) {
                System.out.println("Login bem-sucedido!");
            }
        } catch (LoginInvalidoException e) {
            System.out.println("Erro ao fazer login: " + e.getMessage());
        }
    }
}