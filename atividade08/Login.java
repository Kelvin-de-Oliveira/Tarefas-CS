class Login {
    private String usuario;
    private String senha;

    // Construtor
    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    // Método para fazer login
    public boolean fazerLogin(String usuario, String senha) throws LoginInvalidoException {
        if (this.usuario.equals(usuario) && this.senha.equals(senha)) {
            return true;
        } else {
            throw new LoginInvalidoException("Usuário ou senha incorretos");
        }
    }
}