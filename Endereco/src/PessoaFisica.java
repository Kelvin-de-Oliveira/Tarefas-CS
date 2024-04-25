
import java.util.ArrayList;
import java.util.List;

class PessoaFisica {
    private String nome;
    private char sexo;
    private String dataNascimento;
    private List<Endereco> enderecos = new ArrayList<>();

    public PessoaFisica(String nome, char sexo, String dataNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public void addEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
}