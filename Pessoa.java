// Eduardo Fedeli Souza RM:550132
// Otavio Vitoriano da Silva RM:552012
// Gabriel Torres Luiz RM:98600

public class Pessoa {
    private String nome;
    private String documento;
    private int idade;

    public Pessoa(String nome, String documento, int idade) {
        this.idade = idade;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDocumento() {
        return documento;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", idade=" + idade +
                '}';
    }
}
