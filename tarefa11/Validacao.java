import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {

    // expressão para o login
    private static final String PADRAO_LOGIN = "^[A-Za-z\\d\\S]{5,30}$";
    /*
     * Professor, eu entendi, pelo enunciado, que para o login eu precisava apenas
     * permitir
     * letras, números e caracteres especiais, mas não ser uma obrigação
     */

    // expressão para a senha
    private static final String PADRAO_SENHA = "^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z\\d])[A-Za-z\\d\\S]{8,12}$";

    public static boolean validaLogin(String login) {
        return validar(PADRAO_LOGIN, login);
    }

    public static boolean validaSenha(String senha) {
        return validar(PADRAO_SENHA, senha);
    }

    private static boolean validar(String padrao, String valor) {
        Pattern patternCompilado = Pattern.compile(padrao);
        Matcher matcher = patternCompilado.matcher(valor);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String loginTeste1 = "use";
        String loginTeste2 = "user123"; // sera aceito pois apesar de não possuir caracter especial, pois é uma
                                        // permissao e nao uma restrição
        String senhaTeste1 = "Password1!";
        String senhaTeste2 = "password1!"; // não sera aceito por nao possui letras maiusculas, que e uma restrição

        System.out.println("Login Teste 1: " + validaLogin(loginTeste1));
        System.out.println("Login Teste 2: " + validaLogin(loginTeste2));

        System.out.println("Senha Teste 1: " + validaSenha(senhaTeste1));
        System.out.println("Senha Teste 2: " + validaSenha(senhaTeste2));
    }
}
