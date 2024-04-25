public class App {

    public static void main(String[] args) {

        TipoLogradouro tipoLogradouro = TipoLogradouro.Rua;

        Logradouro rua = new Logradouro(tipoLogradouro, "Rua Exemplo");

        Pais pais = new Pais("Brasil");
        Estado estado = new Estado("São Paulo", "SP", pais);
        Cidade cidade = new Cidade("São Paulo", estado);

        Bairro bairro = new Bairro("Bairro A", cidade);

        Endereco endereco1 = new Endereco(123, "Apto 101", 12345678, TipoEndereco.Residencial, rua, bairro);
        Endereco endereco2 = new Endereco(456, "Casa", 98765432, TipoEndereco.Comercial, rua, bairro);

        PessoaFisica pessoa = new PessoaFisica("João", 'M', "01/01/2000");
        pessoa.addEndereco(endereco1);
        pessoa.addEndereco(endereco2);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sexo: " + pessoa.getSexo());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());

        System.out.println("\nEndereços:");
        for (Endereco endereco : pessoa.getEnderecos()) {
            System.out.println("Número: " + endereco.getNumero());
            System.out.println("Complemento: " + endereco.getComplemento());
            System.out.println("CEP: " + endereco.getCep());
            System.out.println("Tipo: " + endereco.getTipo());
            System.out.println(
                    "Logradouro: " + endereco.getLogradouro().getTipo() + " " + endereco.getLogradouro().getNome());
            System.out.println("Bairro: " + endereco.getBairro().getNome());
            System.out.println("Cidade: " + endereco.getBairro().getCidade().getNome());
            System.out.println("Estado: " + endereco.getBairro().getCidade().getEstado().getNome() + " - "
                    + endereco.getBairro().getCidade().getEstado().getSigla());
            System.out.println("País: " + endereco.getBairro().getCidade().getEstado().getPais().getNome());
            System.out.println();
        }
    }
}