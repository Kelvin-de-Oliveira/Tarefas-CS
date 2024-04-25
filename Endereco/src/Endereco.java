public class Endereco {

    private int numero;
    private String complemento;
    private int CEP;
    private TipoEndereco tipo;
    private Logradouro logradouro;
    private Bairro bairro;

    public Endereco(int numero, String complemento, int CEP, TipoEndereco tipo, Logradouro logradouro, Bairro bairro) {
        this.numero = numero;
        this.complemento = complemento;
        this.CEP = CEP;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return CEP;
    }

    public TipoEndereco getTipo() {
        return tipo;
    }

    public Logradouro getLogradouro() {
        return logradouro;
    }

    public Bairro getBairro() {
        return bairro;
    }

}