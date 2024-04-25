public class Logradouro {
    private String nome;
    private TipoLogradouro tipo;

    public Logradouro(TipoLogradouro tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public TipoLogradouro getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

}