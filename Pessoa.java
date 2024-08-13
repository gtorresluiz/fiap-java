public class Pessoa {
    private String nome;
    private String documento;
    private int idade;

    public Pessoa(String nome, String documento, int idade){
        this.idade = idade;
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getDocumento(){
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
